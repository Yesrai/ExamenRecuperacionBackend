package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Alumno;
@Service
public interface AlumnoService {
	Alumno create(Alumno a);
	Alumno update(Alumno a);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno>readAll();
}
