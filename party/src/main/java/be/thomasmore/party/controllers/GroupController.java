package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Groupp;
import be.thomasmore.party.repositories.GroupRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class GroupController {
    private Logger logger = LoggerFactory.getLogger(GroupController.class);

    @Autowired
    private GroupRepository groupRepository;

    @GetMapping({"/groupdetails", "/groupdetails/{id}"})
    public String groupDetails(Model model,
                                @PathVariable(required = false) Integer id) {
        if (id == null) return "groupdetails";

        Optional<Groupp> optionalGroupp = groupRepository.findById(id);
        if (optionalGroupp.isPresent()) {
            long nrOfArtists = groupRepository.count();
            model.addAttribute("group", optionalGroupp.get());
            model.addAttribute("prevId", id > 1 ? id - 1 : nrOfArtists);
            model.addAttribute("nextId", id < nrOfArtists ? id + 1 : 1);
        }
        return "groupdetails";
    }

    @GetMapping("/grouplist")
    public String artistList(Model model) {
        List<Groupp> groups = groupRepository.findAllBy();
        model.addAttribute("groups", groups);
        model.addAttribute("nrOfGroups", groups.size());
        model.addAttribute("showFilters", false);
        return "grouplist";
    }


}
