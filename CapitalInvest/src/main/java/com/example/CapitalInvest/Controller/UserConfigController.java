package com.example.CapitalInvest.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserConfigController {
    @GetMapping("/Configurações")
    public String UserConfig(){
        return "UserConfig.html";
    }
}
