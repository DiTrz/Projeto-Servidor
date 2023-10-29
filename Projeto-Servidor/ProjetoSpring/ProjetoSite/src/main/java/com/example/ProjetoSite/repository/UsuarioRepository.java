package com.example.ProjetoSite.repository;

import com.example.ProjetoSite.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}