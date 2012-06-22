package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medico{

	
	private int idMedico;
	private int idEspecialidad;
	private int idusuario;
	private Persona persona;

	
	public Medico(int idEspecialidad, int idusuario,Persona persona) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.idusuario = idusuario;
		this.persona = persona;
	}
	
	@Embedded
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	@Id
	@GeneratedValue
	public int getIdMedico() {
		return idMedico;
	}
	public int getIdEspecialidad() {
		return idEspecialidad;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
	
}
