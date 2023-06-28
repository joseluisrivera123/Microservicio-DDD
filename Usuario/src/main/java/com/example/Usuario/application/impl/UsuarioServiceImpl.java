package com.example.Usuario.application.impl;

import com.example.Usuario.domain.model.Usuario;
import com.example.Usuario.domain.repository.UsuarioRepository;
import com.example.Usuario.domain.service.UsuarioService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> finAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> buscarUsuario(Long id) {
        return usuarioRepository.findById(id);
    }
}
