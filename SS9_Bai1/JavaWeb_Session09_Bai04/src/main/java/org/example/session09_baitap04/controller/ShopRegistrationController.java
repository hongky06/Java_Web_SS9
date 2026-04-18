package org.example.session09_baitap04.controller;

import org.example.session09_baitap04.model.ShopRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
//http://localhost:8080/register/step1
@Controller
@SessionAttributes("shopData")
public class ShopRegistrationController {

    @ModelAttribute("shopData")
    public ShopRegistration setUpForm() {
        return new ShopRegistration();
    }
    @GetMapping("/register/step1")
    public String viewStep1(@ModelAttribute("shopData") ShopRegistration shopData) {
        return "step1";
    }

    @PostMapping("/register/step2")
    public String viewStep2(@ModelAttribute("shopData") ShopRegistration shopData) {
        // Lúc này shopData đã tự động có dữ liệu từ Bước 1 nhờ @SessionAttributes
        return "step2";
    }

    @PostMapping("/register/step3")
    public String viewStep3(@ModelAttribute("shopData") ShopRegistration shopData) {
        return "step3";
    }
    @PostMapping("/register/finish")
    public String finishRegistration(
            @ModelAttribute("shopData") ShopRegistration shopData,
            SessionStatus status) {
        System.out.println("Lưu thành công shop: " + shopData.getShopName());
        status.setComplete();
        return "redirect:/register/step1";
    }
}