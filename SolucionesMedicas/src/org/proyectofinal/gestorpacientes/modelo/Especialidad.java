package org.proyectofinal.gestorpacientes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.proyectofinal.gestorpacientes.modelo.Medico;


@Entity
public class Especialidad {
	
	@Id
	@GenericGenerator(name="kaugen" , strategy="increment")
	@GeneratedValue(generator="kaugen")
	private int codigoEspecialidad;
	private String nombreEspecialidad;
	@ManyToOne
	@JoinColumn(name="medico_id")
	private Medico medico;
			
	public int getCodigoEspecialidad() {
		return codigoEspecialidad;
	}
	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setCodigoEspecialidad(int codigoEspecialidad) {
		this.codigoEspecialidad = codigoEspecialidad;
	}
	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	
	
	
	

}
