package com.example.CapitalInvest.Service;


import com.example.CapitalInvest.Entity.Usuario;
import com.example.CapitalInvest.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public boolean loginUsuario(String email, String senha){
        Usuario usuario = usuarioRepository.findByEmail(email);
        return usuario != null && passwordEncoder.matches(senha, usuario.getSenha());
    }
    public Usuario registrarUsuario(String email, String senha, String repetirSenha){
        if(usuarioRepository.findByEmail(email) != null){
            return null;
        }
        Usuario novoUsuario = new Usuario();
        novoUsuario.setEmail(email);
        String Email = novoUsuario.getEmail();
        String nomeUsuario = Email.substring(0, Email.indexOf("@"));
        novoUsuario.setNome(nomeUsuario);
        novoUsuario.setSenha(senha);
        novoUsuario.setRepetirSenha(repetirSenha);
        String Senhasenha = passwordEncoder.encode(novoUsuario.getSenha());
        novoUsuario.setSenha(Senhasenha);

        return usuarioRepository.save(novoUsuario);
    }

    public Usuario buscarUsuarioPorEmail(String email){
        return usuarioRepository.findByEmail(email);
    }
}
