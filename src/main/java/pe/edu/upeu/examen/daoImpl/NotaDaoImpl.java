package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen.dao.NotaDao;
import pe.edu.upeu.examen.entity.Nota;
import pe.edu.upeu.examen.repository.NotaRepository;

@Repository
public class NotaDaoImpl implements NotaDao{
	
	@Autowired
	private NotaRepository notaRepository;

	@Override
	public Nota create(Nota n) {
		// TODO Auto-generated method stub
		return notaRepository.save(n);
	}

	@Override
	public Nota update(Nota n) {
		// TODO Auto-generated method stub
		return notaRepository.save(n);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		notaRepository.deleteById(id);
	}

	@Override
	public Optional<Nota> read(Long id) {
		// TODO Auto-generated method stub
		return notaRepository.findById(id);
	}

	@Override
	public List<Nota> readAll() {
		// TODO Auto-generated method stub
		return notaRepository.findAll();
	}

}
