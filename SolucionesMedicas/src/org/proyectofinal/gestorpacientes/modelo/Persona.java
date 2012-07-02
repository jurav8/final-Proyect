package org.proyectofinal.gestorpacientes.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.JOINED)
public abstract  class Persona {

	
	@Id
	@GenericGenerator(name="persona" , strategy="increment")
	@GeneratedValue(generator="persona")
	private int id;
	private String nombre;
	private String apellido;
	private String telefonoCasa;
	private String telefonoCelular;
	private String direccion;
	private String cedula;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
