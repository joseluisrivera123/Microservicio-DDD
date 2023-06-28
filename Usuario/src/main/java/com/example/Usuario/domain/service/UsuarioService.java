package com.example.Usuario.domain.service;

import com.example.Usuario.domain.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Usuario save(Usuario usuario);

    List<Usuario> finAll();

    Optional<Usuario> buscarUsuario(Long id);
}
