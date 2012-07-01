package org.proyectofinal.gestorpacientes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Recetas {
	
	@Id
	@GenericGenerator(name="persona" , strategy="increment")
	@GeneratedValue(generator="persona")
	private int idReceta;
	private String medicamentos;
	@OneToOne
	@JoinColumn(name = "padecimiento_id")
	private Padecimientos idPadecimientos;
	@OneToOne
	@JoinColumn(name = "paciente_id")
	private Paciente idPaciente;
	
	public Recetas(String medicamentos) {
		super();
		this.medicamentos = medicamentos;
	}
	
	public int getIdReceta() {
		return idReceta;
	}
	public String getMedicamentos() {
		return medicamentos;
	}
	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Padecimientos getIdPadecimientos() {
		return idPadecimientos;
	}

	public void setIdPadecimientos(Padecimientos idPadecimientos) {
		this.idPadecimientos = idPadecimientos;
	}

	public Paciente getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
}
