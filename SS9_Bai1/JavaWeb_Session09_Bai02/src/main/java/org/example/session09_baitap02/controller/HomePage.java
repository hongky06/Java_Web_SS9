package org.example.session09_baitap02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomePage {
    @GetMapping("/home")
    public String homePage(
            @CookieValue(value = "guest_name", defaultValue = "Khách lạ") String guestName,
            Model model
    ) {
        if (guestName.equals("Khách lạ")) {
            model.addAttribute("msg", "Chào khách lạ!");
        } else {
            model.addAttribute("msg", "Chào mừng " + guestName + " trở lại!");
        }

        return "home-page";
    }
}
