package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Embeddable;

@Embeddable
public  class Persona {

	private String nombre;
	private String apellido;
	private String telefonoCasa;
	private String telefonoCelular;
	private String direccion;
	private String cedula;

	
	
	public Persona() {
		super();
	}
	public Persona(String nombre, String apellido, String telefonoCasa,
			String telefonoCelular, String direccion, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonoCasa = telefonoCasa;
		this.telefonoCelular = telefonoCelular;
		this.direccion = direccion;
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getTelefonoCasa() {
		return telefonoCasa;
	}
	public String getTelefonoCelular() {
		return telefonoCelular;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCedula() {
		return cedula;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}
	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
