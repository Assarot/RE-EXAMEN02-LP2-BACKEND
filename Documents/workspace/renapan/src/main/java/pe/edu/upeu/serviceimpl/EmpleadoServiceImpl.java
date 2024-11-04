package pe.edu.upeu.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.EmpleadoDao;
import pe.edu.upeu.entity.Empleado;
import pe.edu.upeu.service.EmpleadoService;
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	@Autowired
	private EmpleadoDao empleadoDao;
	@Override
	public Empleado create(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoDao.create(e);
	}

	@Override
	public Empleado update(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoDao.update(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoDao.delete(id);
	}

	@Override
	public Optional<Empleado> getById(Long id) {
		// TODO Auto-generated method stub
		return empleadoDao.getById(id);
	}

	@Override
	public List<Empleado> getAll() {
		// TODO Auto-generated method stub
		return empleadoDao.getAll();
	}

}
