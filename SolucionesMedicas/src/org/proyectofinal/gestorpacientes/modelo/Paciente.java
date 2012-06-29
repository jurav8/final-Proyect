package org.proyectofinal.gestorpacientes.modelo;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Paciente extends Persona {

	private GregorianCalendar fechaNacimiento;
	private int fumador;
	private String nombreFoto;
	private int idAlergias;
	private int idPadecimientos;
	
	public GregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public int getFumador() {
		return fumador;
	}
	public String getNombreFoto() {
		return nombreFoto;
	}
	public int getIdAlergias() {
		return idAlergias;
	}
	public int getIdPadecimientos() {
		return idPadecimientos;
	}
	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setFumador(int fumador) {
		this.fumador = fumador;
	}
	public void setNombreFoto(String nombreFoto) {
		this.nombreFoto = nombreFoto;
	}
	public void setIdAlergias(int idAlergias) {
		this.idAlergias = idAlergias;
	}
	public void setIdPadecimientos(int idPadecimientos) {
		this.idPadecimientos = idPadecimientos;
	}
	
	
}
