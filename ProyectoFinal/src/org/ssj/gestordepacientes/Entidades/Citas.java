package org.ssj.gestordepacientes.Entidades;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Citas {
	
	private int idCita;
	private GregorianCalendar fecha;
	private String causa;
	private int idPaciente;
	private int idMedico;
	
	@Id
	public int getIdCita() {
		return idCita;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public String getCausa() {
		return causa;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public int getIdMedico() {
		return idMedico;
	}
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	
	

}
