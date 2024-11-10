package pe.edu.upeu.examen.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Nota;

public interface NotaDao {
    Nota create(Nota n);
    Nota update(Nota n);
    void delete(Long id);
	Optional<Nota> read(Long id);
    List<Nota> readAll();
}