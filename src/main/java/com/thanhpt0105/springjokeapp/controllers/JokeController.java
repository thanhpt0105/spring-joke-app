package com.thanhpt0105.springjokeapp.controllers;

import com.thanhpt0105.springjokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    private String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke()); //thymeleaf template
        return "chucknoriss";
    }
}
