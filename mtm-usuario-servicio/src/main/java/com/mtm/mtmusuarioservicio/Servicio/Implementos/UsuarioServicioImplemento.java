package com.mtm.mtmusuarioservicio.Servicio.Implementos;

import com.mtm.mtmusuarioservicio.Entidad.Usuario;
import com.mtm.mtmusuarioservicio.Repositorio.UsuarioRepositorio;
import com.mtm.mtmusuarioservicio.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicioImplemento implements UsuarioServicio {

    @Autowired
    private UsuarioRepositorio kr;

    @Override
    public List<Usuario> Listar() {
        return kr.findAll();
    }

    @Override
    public Optional<Usuario> Buscar(Long id) {
        return kr.findById(id);
    }

    @Override
    public Usuario Guardar(Usuario usuario) {
        return kr.save(usuario);
    }

    @Override
    public Usuario Modificar(Long id, Usuario usuario) {
        usuario.setId(id);
        return kr.save(usuario);
    }

    @Override
    public void Eliminar(Long id) {
        kr.deleteById(id);
    }

}
