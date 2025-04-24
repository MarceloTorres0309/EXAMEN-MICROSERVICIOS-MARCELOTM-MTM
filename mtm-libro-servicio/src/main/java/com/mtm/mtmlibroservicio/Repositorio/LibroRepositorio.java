package com.mtm.mtmlibroservicio.Repositorio;

import com.mtm.mtmlibroservicio.Entidad.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}