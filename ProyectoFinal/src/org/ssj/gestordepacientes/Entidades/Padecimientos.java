package org.ssj.gestordepacientes.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Padecimientos {
	
	private String idPadecimiento;
	private String nombre;
	@Id
	public String getIdPadecimiento() {
		return idPadecimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setIdPadecimiento(String idPadecimiento) {
		this.idPadecimiento = idPadecimiento;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
