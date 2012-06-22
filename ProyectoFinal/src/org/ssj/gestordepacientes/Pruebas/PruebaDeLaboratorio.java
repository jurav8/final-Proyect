package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PruebaDeLaboratorio {

	@Id
	private int codigoPrueba;
	private String nombreDeLaPrueba;
	
	public int getCodigoPrueba() {
		return codigoPrueba;
	}
	public String getNombreDeLaPrueba() {
		return nombreDeLaPrueba;
	}
	public void setCodigoPrueba(int codigoPrueba) {
		this.codigoPrueba = codigoPrueba;
	}
	public void setNombreDeLaPrueba(String nombreDeLaPrueba) {
		this.nombreDeLaPrueba = nombreDeLaPrueba;
	}
	
	
}
