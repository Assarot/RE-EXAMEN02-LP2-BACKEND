package pe.edu.upeu.lpproducto.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lpproducto.dao.ProductoDao;
import pe.edu.upeu.lpproducto.entity.Producto;
import pe.edu.upeu.lpproducto.service.ProductoService;
@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoDao productoDao;
	@Override
	public Producto create(Producto p) {
		// TODO Auto-generated method stub
		return productoDao.create(p);
	}

	@Override
	public Producto update(Producto p) {
		// TODO Auto-generated method stub
		return productoDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoDao.delete(id);
	}

	@Override
	public Optional<Producto> getById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.getById(id);
	}

	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return productoDao.getAll();
	}

}
