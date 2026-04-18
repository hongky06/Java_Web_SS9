package org.example.session09_baitap03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class homePage {
    @GetMapping()
    public String homePage(
            @CookieValue(value = "app_theme", defaultValue = "light") String currentTheme,
            Model model
    ) {
        model.addAttribute("theme", currentTheme);
        return "home-page";
    }
}
