package pe.edu.upeu.lpproducto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproducto")
	private Long idproducto;
	@Column(name = "nombre", columnDefinition = "varchar(100)")
	private String nombre;
	@Column(name = "stock", columnDefinition = "integer")
	private int stock;
	@Column(name = "precio", columnDefinition = "decimal(10,2)")
	private double precio;
	@Column(name = "estado", columnDefinition = "char(1)")
	private char estado;
}
