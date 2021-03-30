package be.thomasmore.party.controllers;

import be.thomasmore.party.model.News;
import be.thomasmore.party.repositories.NewsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class NewsController {
    private Logger logger = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/newslist")
    public String newsList(Model model) {
        Iterable<News> newss = newsRepository.findAll();
        model.addAttribute("newss", newss);
        return "newslist";
    }

    @GetMapping({"/newsdetails", "/newsdetails/{id}"})
    public String newsDetails(Model model,
                               @PathVariable(required = false) Integer id) {
        if (id == null) return "newsdetails";

        Optional<News> optionalNews= newsRepository.findById(id);
        if (optionalNews.isPresent()) {
            long nrOfNews = newsRepository.count();
            model.addAttribute("news", optionalNews.get());
            model.addAttribute("prevId", id > 1 ? id - 1 : nrOfNews);
            model.addAttribute("nextId", id < nrOfNews ? id + 1 : 1);
        }
        return "newsdetails";
    }

}
