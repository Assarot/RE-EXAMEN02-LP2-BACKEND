package pe.edu.upeu.lpproducto.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.lpproducto.entity.Cliente;

public interface ClienteService {
	Cliente create(Cliente c);
	Cliente update(Cliente c);
	void delete(Long id);
	Optional<Cliente> getById(Long id);
	List<Cliente> getAll();
}
