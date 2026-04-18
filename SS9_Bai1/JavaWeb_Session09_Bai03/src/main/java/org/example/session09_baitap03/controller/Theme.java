package org.example.session09_baitap03.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class Theme {
    @PostMapping("/change-theme")
    public String changeTheme(@RequestParam("theme") String theme, HttpServletResponse response) {
        Cookie themeCookie = new Cookie("app_theme", theme);
        int expiryTime = 30 * 24 * 60 * 60;
        themeCookie.setMaxAge(expiryTime);
        themeCookie.setHttpOnly(true);
        themeCookie.setPath("/");
        response.addCookie(themeCookie);
        return "redirect:/";
    }
}
