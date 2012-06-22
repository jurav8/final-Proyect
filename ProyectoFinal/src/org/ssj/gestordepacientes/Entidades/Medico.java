package org.ssj.gestordepacientes.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medico{
	
	
	private int idMedico;
	private String nombre;
	private String apellido;
	private String telefonoCasa;
	private String celular;
	private String direccion;
	private String cedula;
	private int idEspecialidad;
	private int idUsuario;
	
	@Id
	public int getIdMedico() {
		return idMedico;
	}
	public int getIdEspecialidad() {
		return idEspecialidad;
	}
	public int getIdUsuario() {
		return idUsuario;
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
	public String getCelular() {
		return celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCedula() {
		return cedula;
	}
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
