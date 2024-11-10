package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Nota;

@Service
public interface NotaService {
	Nota create(Nota n);
	Nota update(Nota n);
	void delete(Long id);
	Optional<Nota> read(Long id);
	List<Nota> readAll();

}