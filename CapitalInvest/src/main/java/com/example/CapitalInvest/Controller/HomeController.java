package com.example.CapitalInvest.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/Home")
    public String HomeScreen(){
        return "Home";
    }

    @RequestMapping("/Login")
    public String login(){
        return "SignIn.html";
    }

    @GetMapping("/Home2")
    public String Home2(){

        return "Home2.html";
    }

}
