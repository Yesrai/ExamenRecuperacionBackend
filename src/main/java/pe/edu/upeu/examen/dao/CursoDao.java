package pe.edu.upeu.examen.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Curso;

public interface CursoDao {
	Curso create(Curso c);
	Curso update(Curso c);
    void delete(Long id);
	Optional<Curso> read(Long id);
    List<Curso> readAll();
}