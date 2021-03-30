package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Activity;

import be.thomasmore.party.model.News;
import be.thomasmore.party.repositories.ActivityRepository;
import be.thomasmore.party.repositories.NewsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ActivityController {
    private Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private NewsRepository newsRepository;


    @GetMapping({"/activitydetails", "/activitydetails/{id}"})
    public String activityDetails(Model model,
                               @PathVariable(required = false) Integer id) {
        if (id == null) return "activitydetails";

        Optional<Activity> optionalActivity = activityRepository.findById(id);
        if (optionalActivity.isPresent()) {
            long nrOfActivitys = activityRepository.count();
            Iterable<News> newss= newsRepository.findByActivity(optionalActivity.get());

            model.addAttribute("activity", optionalActivity.get());
            model.addAttribute("prevId", id > 1 ? id - 1 : nrOfActivitys);
            model.addAttribute("nextId", id < nrOfActivitys ? id + 1 : 1);
            model.addAttribute("newss", newss);

        }
        return "activitydetails";
    }

    @GetMapping({"/activitylist"})
    public String activityList(Model model) {
        logger.info("activityList");
        Iterable<Activity> activities = activityRepository.findAll();
        long nrOfActivitys = activityRepository.count();
        model.addAttribute("activities", activities);
        model.addAttribute("nrOfActivitys", nrOfActivitys);
        model.addAttribute("showFilters", false);
        return "activitylist";
    }

    @GetMapping({"/activitylist/filter"})
    public String activityListWithFilter(Model model,
                                      @RequestParam(required = false) Integer minCapacity,
                                      @RequestParam(required = false) Integer maxCapacity,
                                      @RequestParam(required = false) Integer maxDistance,
                                      @RequestParam(required = false) String filterFood,
                                      @RequestParam(required = false) String filterIndoor,
                                      @RequestParam(required = false) String filterOutdoor) {
        logger.info(String.format("activityListWithFilter -- min=%d, max=%d, distance=%d, filterFood=%s, filterIndoor=%s, , filterOutdoor=%s",
                minCapacity, maxCapacity, maxDistance, filterFood, filterIndoor, filterIndoor));
        List<Activity> activitys = activityRepository.findByFilter(minCapacity, maxCapacity,
                maxDistance,filterStringToBoolean(filterFood), filterStringToBoolean(filterIndoor), filterStringToBoolean(filterOutdoor));



        model.addAttribute("activities", activitys);
        model.addAttribute("nrOfActivitys", activitys.size());
        model.addAttribute("showFilters", true);
        model.addAttribute("minCapacity", minCapacity);
        model.addAttribute("maxCapacity", maxCapacity);
        model.addAttribute("maxDistance", maxDistance);
        model.addAttribute("filterFood", filterFood);
        model.addAttribute("filterIndoor", filterIndoor);
        model.addAttribute("filterOutdoor", filterOutdoor);

        return "activitylist";
    }

    private Boolean filterStringToBoolean(String filterString) {
        return (filterString == null || filterString.equals("all")) ? null : filterString.equals("yes");
    }



}
