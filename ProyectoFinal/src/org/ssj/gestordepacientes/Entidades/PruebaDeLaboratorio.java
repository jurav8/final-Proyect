package org.ssj.gestordepacientes.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PruebaDeLaboratorio {

	private int idPrueba;
	private String nombreDeLaPrueba;
	
	@Id
	public int getIdPrueba() {
		return idPrueba;
	}
	public String getNombreDeLaPrueba() {
		return nombreDeLaPrueba;
	}
	public void setIdPrueba(int idPrueba) {
		this.idPrueba = idPrueba;
	}
	public void setNombreDeLaPrueba(String nombreDeLaPrueba) {
		this.nombreDeLaPrueba = nombreDeLaPrueba;
	}
	
	
}
