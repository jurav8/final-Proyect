package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Especialidad {
	
	@Id
	private int codigoEspecialidad;
	private String nombreEspecialidad;
	
	public Especialidad(int codigoEspecialidad, String nombreEspecialidad) {
		super();
		this.codigoEspecialidad = codigoEspecialidad;
		this.nombreEspecialidad = nombreEspecialidad;
	}
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
	
	

}
