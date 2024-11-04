package pe.edu.upeu.entity;

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

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempleado")
	private Long idempleado;
	@Column(name = "nombres", columnDefinition = "varchar(50)")
	private String nombres;
	@Column(name = "apellidos", columnDefinition = "varchar(50)")
	private String apellidos;
	@Column(name = "correo", columnDefinition = "varchar(320)")
	private String correo;
	@Column(name = "telefono", columnDefinition = "varchar(15)")
	private String telefono;
}
