package org.ssj.gestordepacientes.Entidades;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente {
	
	private int idPaciente;
	private String nombre;
	private String apellido;
	private String telefonoPersonal;
	private String direccion;
	private String cedula;
	private GregorianCalendar fechaDeNacimiento;
	private int fumador;
	private String nombreFoto;
	private int idAlergia;
	private int idPadecimiento;
	
	@Id
	public int getIdPaciente() {
		return idPaciente;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getTelefonoPersonal() {
		return telefonoPersonal;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCedula() {
		return cedula;
	}
	public GregorianCalendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public int getFumador() {
		return fumador;
	}
	public String getNombreFoto() {
		return nombreFoto;
	}
	public int getIdAlergia() {
		return idAlergia;
	}
	public int getIdPadecimiento() {
		return idPadecimiento;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setTelefonoPersonal(String telefonoPersonal) {
		this.telefonoPersonal = telefonoPersonal;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public void setFumador(int fumador) {
		this.fumador = fumador;
	}
	public void setNombreFoto(String nombreFoto) {
		this.nombreFoto = nombreFoto;
	}
	public void setIdAlergia(int idAlergia) {
		this.idAlergia = idAlergia;
	}
	public void setIdPadecimiento(int idPadecimiento) {
		this.idPadecimiento = idPadecimiento;
	}
	
	
	
	

}
