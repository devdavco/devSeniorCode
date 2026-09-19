package com.prueba.pruebamaven.service;

import com.prueba.pruebamaven.dto.AuthResponse;
import com.prueba.pruebamaven.dto.LoginRequest;
import com.prueba.pruebamaven.dto.RegistroRequest;
import com.prueba.pruebamaven.model.Rol;
import com.prueba.pruebamaven.model.Usuario;
import com.prueba.pruebamaven.repository.UsuarioRepository;
import com.prueba.pruebamaven.security.JwtService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthService(UsuarioRepository usuarioRepository,
                       PasswordEncoder passwordEncoder,
                       AuthenticationManager authenticationManager,
                       JwtService jwtService) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    public AuthResponse registrar(RegistroRequest request) {
        Usuario usuario = new Usuario();
        usuario.setEmail(request.getEmail());
        usuario.setPassword(passwordEncoder.encode(request.getPassword()));
        usuario.setRol(Rol.USER);
        usuarioRepository.save(usuario);

        String token = jwtService.generarToken(usuario.getEmail(), usuario.getRol().name());
        return new AuthResponse(token);
    }

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(), request.getPassword()));

        Usuario usuario = usuarioRepository.findByEmail(request.getEmail()).orElseThrow();
        String token = jwtService.generarToken(usuario.getEmail(), usuario.getRol().name());
        return new AuthResponse(token);
    }
}