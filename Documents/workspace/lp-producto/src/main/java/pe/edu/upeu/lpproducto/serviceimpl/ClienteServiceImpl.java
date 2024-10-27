package pe.edu.upeu.lpproducto.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lpproducto.dao.ClienteDao;
import pe.edu.upeu.lpproducto.entity.Cliente;
import pe.edu.upeu.lpproducto.service.ClienteService;
@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteDao clienteDao;
	@Override
	public Cliente create(Cliente c) {
		// TODO Auto-generated method stub
		return clienteDao.create(c);
	}

	@Override
	public Cliente update(Cliente c) {
		// TODO Auto-generated method stub
		return clienteDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.delete(id);
	}

	@Override
	public Optional<Cliente> getById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.getById(id);
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return clienteDao.getAll();
	}

}
