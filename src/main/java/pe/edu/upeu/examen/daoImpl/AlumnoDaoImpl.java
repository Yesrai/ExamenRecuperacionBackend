package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen.dao.AlumnoDao;
import pe.edu.upeu.examen.entity.Alumno;
import pe.edu.upeu.examen.repository.AlumnoRepository;

@Repository
public class AlumnoDaoImpl implements AlumnoDao {
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

}