package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alergia {
	
	@Id
	private int idAlergia;
	private String nombreAlergia;
	
	
	public Alergia(int idAlergia, String nombreAlergia) {
		super();
		this.idAlergia = idAlergia;
		this.nombreAlergia = nombreAlergia;
	}
	
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
	
	

}
