package org.ssj.gestordepacientes.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Especialidad {
	
	private int idEspecialidad;
	private String nombreEspecialidad;
	
	@Id
	public int getIdEspecialidad() {
		return idEspecialidad;
	}
	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}
	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}
	
	

}
