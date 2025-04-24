package com.mtm.mtmusuarioservicio.Repositorio;

import com.mtm.mtmusuarioservicio.Entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
