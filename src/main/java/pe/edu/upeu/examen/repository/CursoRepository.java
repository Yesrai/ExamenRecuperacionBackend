package pe.edu.upeu.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.examen.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
