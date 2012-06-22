package org.ssj.gestordepacientes.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alergia {
	
	private int idAlergia;
	private String nombreDeLaAlergia;
	
	@Id
	public int getIdAlergia() {
		return idAlergia;
	}
	public String getNombreDeLaAlergia() {
		return nombreDeLaAlergia;
	}
	public void setIdAlergia(int idAlergia) {
		this.idAlergia = idAlergia;
	}
	public void setNombreDeLaAlergia(String nombreDeLaAlergia) {
		this.nombreDeLaAlergia = nombreDeLaAlergia;
	}
	
	

}
