package pe.edu.upeu.lpproducto.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.lpproducto.entity.Producto;

public interface ProductoService {
	Producto create(Producto p);
	Producto update(Producto p);
	void delete(Long id);
	Optional<Producto> getById(Long id);
	List<Producto> getAll();
}
