package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Groupp;
import be.thomasmore.party.repositories.ActivityRepository;
import be.thomasmore.party.repositories.GroupRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class GroupController {
    private Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Autowired
    private GroupRepository GroupRepository;

    @GetMapping({"/groupdetails", "/groupdetails/{id}"})
    public String groupDetails(Model model,
                               @PathVariable(required = false)  Integer id) {

        if (id == null) return "groupdetails";

        Optional<Groupp> optionalGroupp = GroupRepository.findById(id);
        if (optionalGroupp.isPresent()) {
            long nrOfGroup = GroupRepository.count();
            model.addAttribute("group", optionalGroupp.get());
            model.addAttribute("prevId", id > 1 ? id - 1 : nrOfGroup);
            model.addAttribute("nextId", id < nrOfGroup ? id + 1 : 1);
        }
        return "groupdetails";
    }

    @GetMapping("/grouplist")
    public String groupList(Model model) {
        Iterable<Groupp> groups = GroupRepository.findAll();
        model.addAttribute("groups", groups);
        return "grouplist";
    }
}
