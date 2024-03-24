package com.example.CapitalInvest.Controller;

import com.example.CapitalInvest.Model.Usuario;
import com.example.CapitalInvest.Repository.UsuarioRepository;
import com.example.CapitalInvest.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class SignUpController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @RequestMapping ("/SignUp")
    public String SignUpPagina(){
        return "SignUp.html";
    }

    @PostMapping("/SignUp")
    public String SignUp(@RequestParam String email,
                          @RequestParam String senha,
                           @RequestParam String repetirSenha,
                         Model model){

        Usuario novoUsuario = usuarioService.registrarUsuario(email, senha, repetirSenha);
        if(novoUsuario == null){
            model.addAttribute("error", "O email já existe no sistema");
        }
        else{
            return "redirect:/Home2";
        }
        return "SignUp.html";
    }

}
