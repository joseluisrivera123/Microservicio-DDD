package com.example.Usuario.infraestructure.rest;


import com.example.Usuario.domain.model.Usuario;
import com.example.Usuario.domain.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }


    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.finAll();
    }

    @PostMapping("/register")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @GetMapping("/buscar/{id}")
    public Optional<Usuario> finById(@PathVariable Long id){
        return usuarioService.buscarUsuario(id);
    }
}
