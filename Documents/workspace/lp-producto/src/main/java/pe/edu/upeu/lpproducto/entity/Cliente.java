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
@Table(name="Cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
	private Long idcliente;
	@Column(name = "nombre", columnDefinition = "varchar(300)")
	private String nombre;
	@Column(name = "telefono", columnDefinition = "varchar(15)")
	private String telefono;
	@Column(name = "direccion", columnDefinition = "varchar(500)")
	private String direccion;
	@Column(name = "dni", columnDefinition = "char(8)")
	private String dni;
	
}
