package com.example.baitaphotro2.controller;

import com.example.baitaphotro2.model.ChungCake;
import com.example.baitaphotro2.service.ChungCakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chungCakes")
public class ChungCakeController {
    @Autowired
    public ChungCakeService chungCakeService;

    @GetMapping()
    public String chungCake(Model model) {
        List<ChungCake> chungCakeList = chungCakeService.getChungCakeList();

        model.addAttribute("chungCakeLists", chungCakeList);

        return "/home";
    }

    @GetMapping("/add-chungCake")
    public String showAddChungCakeForm(Model model) {
        ChungCake chungCake = new ChungCake();

        model.addAttribute("chungCake", chungCake);

        return "/create";
    }

    @PostMapping("/create")
    public String createChungCake(@ModelAttribute ChungCake chungCake) {
        chungCakeService.createChungCake(chungCake);

        return "redirect:/chungCakes";
    }

    @GetMapping("/edit/{id}")
    public String showEditChungCakeForm(@PathVariable int id, Model model) {
        ChungCake chungCake = chungCakeService.getChungCakeById(id);

        model.addAttribute("chungCake", chungCake);

        return "/edit";
    }

    @PostMapping("/update")
    public String updateChungCake(@ModelAttribute ChungCake chungCake) {
        chungCakeService.updateChungCake(chungCake);

        return "redirect:/chungCakes";
    }

}
