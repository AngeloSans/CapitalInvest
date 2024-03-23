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
public class LoginController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/Login")
    public String Login(@RequestParam String email,
                        @RequestParam String senha,
                        Model model){

        if(usuarioService.loginUsuario(email, senha)){
            Usuario usuario = usuarioService.buscarUsuarioPorEmail(email);
            model.addAttribute("nomeUsuario", usuario.getNome());
            return "redirect:/Home2";
        }
        else{
            model.addAttribute("naoexiste", "esse usuario não existe no nosso banco de dados");
            return "SignIn.html";

        }
    }

}
