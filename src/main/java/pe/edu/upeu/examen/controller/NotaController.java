package pe.edu.upeu.examen.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import pe.edu.upeu.examen.entity.Nota;
import pe.edu.upeu.examen.service.NotaService;

@RestController
@RequestMapping("/api/nota")
@CrossOrigin(origins = "http://localhost:51682")
public class NotaController {
	
	@Autowired
	private NotaService notaService;
	
	@GetMapping
	public ResponseEntity<List<Nota>> readAll() {
		try {
			List<Nota> notas = notaService.readAll();
			if (notas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		
			for (Nota nota : notas) {
				int promedio = (nota.getNota1() + nota.getNota2() + nota.getNota3()) / 3;
				nota.setPromedio(promedio); 
			}
			return new ResponseEntity<>(notas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Nota> crear(@Valid @RequestBody Nota not) {
		try {
			int promedio = (not.getNota1() + not.getNota2() + not.getNota3()) / 3;
			not.setPromedio(promedio);
			Nota n = notaService.create(not);
			return new ResponseEntity<>(n, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Nota> getNotaId(@PathVariable("id") Long id) {
		try {
			Optional<Nota> notaOpt = notaService.read(id);
			if (notaOpt.isPresent()) {
				Nota nota = notaOpt.get();
				int promedio = (nota.getNota1() + nota.getNota2() + nota.getNota3()) / 3;
				nota.setPromedio(promedio); 
				return new ResponseEntity<>(nota, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> delNota(@PathVariable("id") Long id) {
		try {
			notaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Nota> updateNota(@PathVariable("id") Long id, @Valid @RequestBody Nota not) {
		Optional<Nota> notaOpt = notaService.read(id);
		if (notaOpt.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			int promedio = (not.getNota1() + not.getNota2() + not.getNota3()) / 3;
			not.setPromedio(promedio);
			Nota notaActualizada = notaService.update(not);
			return new ResponseEntity<>(notaActualizada, HttpStatus.OK);
		}
	}
}
