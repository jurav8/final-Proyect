package org.proyectofinal.gestorpacientes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Alergia {
	
	@Id
	@GenericGenerator(name="persona" , strategy="increment")
	@GeneratedValue(generator="persona")
	private int idAlergia;
	private String nombreAlergia;
	@ManyToOne
	@JoinColumn(name="paciente_id")
	private Paciente alergiaPaciente;
		
	public int getIdAlergia() {
		return idAlergia;
	}
	public String getNombreAlergia() {
		return nombreAlergia;
	}
	public void setIdAlergia(int idAlergia) {
		this.idAlergia = idAlergia;
	}
	public void setNombreAlergia(String nombreAlergia) {
		this.nombreAlergia = nombreAlergia;
	}

	public Paciente getPaciente() {
		return alergiaPaciente;
	}

	public void setPaciente(Paciente paciente) {
		this.alergiaPaciente = paciente;
	}
	
	

}
