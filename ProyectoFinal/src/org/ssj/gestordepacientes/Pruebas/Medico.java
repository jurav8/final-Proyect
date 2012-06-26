package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="medico")
public class Medico extends Persona{

	private int idusuario;

	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}	
	
}
