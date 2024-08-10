package com.credbank.backend.controller;

import com.credbank.backend.config.TokenService;
import com.credbank.backend.entity.Usuario;
import com.credbank.backend.entity.dto.AuthenticationDTO;
import com.credbank.backend.entity.dto.LoginDTO;
import com.credbank.backend.entity.dto.UsuarioDTO;
import com.credbank.backend.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class UsuarioController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.nome(), data.senha());
        var auth = this.authenticationManager.authenticate(usernamePassword);
        var token = tokenService.generateToken((Usuario) auth.getPrincipal());

        return ResponseEntity.ok(new LoginDTO(token));
    }


    @PostMapping("register")
    public ResponseEntity register(@RequestBody @Valid UsuarioDTO data) {
        if (this.usuarioRepository.findByNome(data.getNome()) != null) {
            return ResponseEntity.badRequest().build();
        }
        String encryptedPassword = new BCryptPasswordEncoder().encode(data.getSenha());
        Usuario usuario = new Usuario(null, data.getNome(), encryptedPassword, data.getRole());
        this.usuarioRepository.save(usuario);

        return ResponseEntity.ok().build();
    }
}
