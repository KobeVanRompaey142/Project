package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Activity;
import be.thomasmore.party.repositories.ActivityRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ActivityController {


    @Autowired
    private ActivityRepository ActivitiesRepository;


    @GetMapping({"/activitydetails", "/activitydetails/{id}"})
    public String activityDetails(Model model,
                                  @PathVariable(required = false)  Integer id) {

        if (id == null) return "activitydetails";

        Optional<Activity> optionalActivity = ActivitiesRepository.findById(id);

        if (optionalActivity.isPresent()) {
            long nrOfActivity = ActivitiesRepository.count();
            model.addAttribute("activity", optionalActivity.get());
            model.addAttribute("prevId", id > 1 ? id - 1 : nrOfActivity);
            model.addAttribute("nextId", id < nrOfActivity ? id + 1 : 1);
        }
        return "activitydetails";
    }

    @GetMapping("/activitylist")
    public String activityList(Model model) {
        Iterable<Activity> activitys = ActivitiesRepository.findAll();
        model.addAttribute("activitys", activitys);
        return "activitylist";
    }
   }



