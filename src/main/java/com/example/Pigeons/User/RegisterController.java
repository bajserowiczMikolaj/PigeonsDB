package com.example.Pigeons.User;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.GET;
@Controller
public class RegisterController {

    @GET //odebranie danych
    @RequestMapping(value = "/register")  //obsluga wywolania
    public String registerForm(Model model) {
        User u = new User();
        model.addAttribute("user", u);
        return "register";
    }
}
