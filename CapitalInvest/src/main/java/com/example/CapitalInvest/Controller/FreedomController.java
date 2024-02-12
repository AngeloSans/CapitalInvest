package com.example.CapitalInvest.Controller;


import com.example.CapitalInvest.Service.FreedomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FreedomController {
    @Autowired
    FreedomService freedomService;
    @GetMapping("/Liberdade Financeira")
    public String Freedom(){
        return "Freedom.html";
    }
    @GetMapping("/Calcular")
    public String calcular(Model model, @RequestParam("valorMensal") double valorMensal, @RequestParam("anos") int anos){
        double total = freedomService.calcularLiberdade(anos, valorMensal);
        model.addAttribute("total", "Em "+ anos+ " anos "+"Voce ira ter o  total de: " + total+" investindo: "+ valorMensal);
        return "Freedom.html";
    }
}
