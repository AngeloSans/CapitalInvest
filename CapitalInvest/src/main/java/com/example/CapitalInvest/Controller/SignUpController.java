package com.example.CapitalInvest.Controller;

import com.example.CapitalInvest.Model.Usuario;
import com.example.CapitalInvest.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

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
                           @RequestParam String repetirSenha ){

        Usuario novoUsuario = new Usuario();
        novoUsuario.setEmail(email);
        novoUsuario.setSenha(senha);
        novoUsuario.setRepetirSenha(repetirSenha);
        String Senhasenha = passwordEncoder.encode(novoUsuario.getSenha());
        novoUsuario.setSenha(Senhasenha);

        usuarioRepository.save(novoUsuario);

        return "Home.html";

    }

}
