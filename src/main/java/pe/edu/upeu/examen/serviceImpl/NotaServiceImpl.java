package pe.edu.upeu.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.dao.NotaDao;
import pe.edu.upeu.examen.entity.Nota;
import pe.edu.upeu.examen.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService{

	@Autowired
	private NotaDao notaDao;
	
	@Override
	public Nota create(Nota n) {
		// TODO Auto-generated method stub
		return notaDao.create(n);
	}

	@Override
	public Nota update(Nota n) {
		// TODO Auto-generated method stub
		return notaDao.update(n);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		notaDao.delete(id);

	}

	@Override
	public Optional<Nota> read(Long id) {
		// TODO Auto-generated method stub
		return notaDao.read(id);
	}

	@Override
	public List<Nota> readAll() {
		// TODO Auto-generated method stub
		return notaDao.readAll();
	}

}