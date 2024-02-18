package com.example.CapitalInvest.Controller;


import com.example.CapitalInvest.Model.Usuario;
import com.example.CapitalInvest.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/Login")
    public String Login(@RequestParam String email,
                        @RequestParam String senha,
                        Model model){
        Usuario usuario = usuarioRepository.findByEmail(email);

        if(usuario != null && passwordEncoder.matches(senha, usuario.getSenha())){
            model.addAttribute("usuarioLogado", true);
            return "Home.html";
        }
        else{
            return "SignIn.html";
        }
    }

}
