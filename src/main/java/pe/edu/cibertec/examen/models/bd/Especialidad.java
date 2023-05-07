package pe.edu.cibertec.examen.models.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {
	@Id
	@GeneratedValue
	private Integer idesp;
	@Column(name = "nomesp")
	private String nomesp;	
}