package pe.edu.upeu.lpproducto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lpproducto.entity.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
