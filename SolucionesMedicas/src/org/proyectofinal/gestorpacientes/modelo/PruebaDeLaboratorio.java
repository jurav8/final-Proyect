package org.proyectofinal.gestorpacientes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class PruebaDeLaboratorio {

	@Id
	@GenericGenerator(name="persona" , strategy="increment")
	@GeneratedValue(generator="persona")
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
