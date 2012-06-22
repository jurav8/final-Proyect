package org.ssj.gestordepacientes.Pruebas;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente extends Persona {

	@Id
	private int idPaciente;
	private GregorianCalendar fechaNacimiento;
	private int fumador;
	private String nombreFoto;
	private int idAlergias;
	private int idPadecimientos;
	
	public Paciente(String nombre, String apellido, String telefonoCasa,
			String telefonoCelular, String direccion, String cedula,
			int idPaciente, GregorianCalendar fechaNacimiento, int fumador,
			String nombreFoto, int idAlergias, int idPadecimientos) {
		super(nombre, apellido, telefonoCasa, telefonoCelular, direccion,
				cedula);
		this.idPaciente = idPaciente;
		this.fechaNacimiento = fechaNacimiento;
		this.fumador = fumador;
		this.nombreFoto = nombreFoto;
		this.idAlergias = idAlergias;
		this.idPadecimientos = idPadecimientos;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
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
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
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
