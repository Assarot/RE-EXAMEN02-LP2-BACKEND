package pe.edu.upeu.lpproducto.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.lpproducto.dao.ProductoDao;
import pe.edu.upeu.lpproducto.entity.Producto;
import pe.edu.upeu.lpproducto.repository.ProductoRepository;
@Component
public class ProductoDaoImpl implements ProductoDao{
	
	@Autowired
	private ProductoRepository productoRepository;
	@Override
	public Producto create(Producto p) {
		// TODO Auto-generated method stub
		return productoRepository.save(p);
	}

	@Override
	public Producto update(Producto p) {
		// TODO Auto-generated method stub
		return productoRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
	}

	@Override
	public Optional<Producto> getById(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

}
