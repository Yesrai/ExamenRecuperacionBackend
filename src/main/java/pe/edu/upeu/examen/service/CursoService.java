package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Curso;

@Service
public interface CursoService {
	Curso create(Curso c);
	Curso update(Curso c);
	void delete(Long id);
	Optional<Curso> read(Long id);
	List<Curso>readAll();
}
