package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen.dao.CursoDao;
import pe.edu.upeu.examen.entity.Curso;
import pe.edu.upeu.examen.repository.CursoRepository;

@Repository
public class CursoDaoImpl implements CursoDao{

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public Curso create(Curso c) {
		// TODO Auto-generated method stub
		return cursoRepository.save(c);
	}

	@Override
	public Curso update(Curso c) {
		// TODO Auto-generated method stub
		return cursoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursoRepository.deleteById(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return cursoRepository.findById(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return cursoRepository.findAll();
	}

}
