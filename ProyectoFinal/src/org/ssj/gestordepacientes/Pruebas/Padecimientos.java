package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Padecimientos {
	
	@Id
	@GenericGenerator(name="persona" , strategy="increment")
	@GeneratedValue(generator="persona")
	private int idPadecimiento;
	private String nombre;
	
	public int getIdPadecimiento() {
		return idPadecimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setIdPadecimiento(int idPadecimiento) {
		this.idPadecimiento = idPadecimiento;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
