package com.mtm.mtmusuarioservicio.Servicio;

import com.mtm.mtmusuarioservicio.Entidad.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioServicio {

    List<Usuario> Listar();
    Optional<Usuario> Buscar(Long id);
    Usuario Guardar(Usuario usuario);
    Usuario Modificar(Long id, Usuario usuario);
    void Eliminar(Long id);


}