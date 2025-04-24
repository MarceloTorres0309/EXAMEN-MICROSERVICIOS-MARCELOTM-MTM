package com.mtm.mtmusuarioservicio.Controlador;

import com.mtm.mtmusuarioservicio.Entidad.Usuario;
import com.mtm.mtmusuarioservicio.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio kr;


    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuario() {
        List<Usuario> usuarios = kr.Listar();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable Long id) {
        Optional<Usuario> usuarios = kr.Buscar(id);
        return usuarios.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuarios) {
        Usuario nuevousuarios = kr.Guardar(usuarios);
        return new ResponseEntity<>(nuevousuarios, HttpStatus.CREATED);
    }



    @PutMapping("/{id}")
    public ResponseEntity<Usuario> modificarUsuario(@PathVariable Long id, @RequestBody Usuario usuarios) {
        Usuario usuariosModificado = kr.Modificar(id, usuarios);
        return usuariosModificado != null ? new ResponseEntity<>(usuariosModificado, HttpStatus.OK)
                : ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> eliminarUsuario(@PathVariable Long id) {
        kr.Eliminar(id);
        return ResponseEntity.noContent().build();
    }


}
