package com.example.Usuario.domain.repository;

import com.example.Usuario.domain.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
