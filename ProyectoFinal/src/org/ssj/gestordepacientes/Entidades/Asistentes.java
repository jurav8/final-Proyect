package org.ssj.gestordepacientes.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asistentes {

	private int codigoEmpleado;
	private String nombreAsistente;
	private String apellido;
	private String telefonoCasaDeAsistente;
	private String telefonoCelularDeAsistente;
	private String direccion;
	private String cedula;
	private int idUsuario;
	
	@Id
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public String getNombreAsistente() {
		return nombreAsistente;
	}
	public String getApellido() {
		return apellido;
	}
	public String getTelefonoCasaDeAsistente() {
		return telefonoCasaDeAsistente;
	}
	public String getTelefonoCelularDeAsistente() {
		return telefonoCelularDeAsistente;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCedula() {
		return cedula;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public void setNombreAsistente(String nombreAsistente) {
		this.nombreAsistente = nombreAsistente;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setTelefonoCasaDeAsistente(String telefonoCasaDeAsistente) {
		this.telefonoCasaDeAsistente = telefonoCasaDeAsistente;
	}
	public void setTelefonoCelularDeAsistente(String telefonoCelularDeAsistente) {
		this.telefonoCelularDeAsistente = telefonoCelularDeAsistente;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
}
