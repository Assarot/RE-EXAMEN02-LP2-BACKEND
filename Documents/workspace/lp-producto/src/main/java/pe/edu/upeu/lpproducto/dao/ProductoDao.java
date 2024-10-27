package pe.edu.upeu.lpproducto.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.lpproducto.entity.Producto;

public interface ProductoDao {
	Producto create(Producto p);
	Producto update(Producto p);
	void delete(Long id);
	Optional<Producto> getById(Long id);
	List<Producto> getAll();
}
