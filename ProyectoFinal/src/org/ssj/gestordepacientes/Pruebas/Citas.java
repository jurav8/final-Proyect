package org.ssj.gestordepacientes.Pruebas;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Citas {
	
	@Id
	private int idCitas;
	private GregorianCalendar fecha;
	private String hora;
	private String causa;
	private int idPaciente;
	private int idMedico;
	
	public Citas(int idCitas, GregorianCalendar fecha, String hora,
			String causa, int idPaciente, int idMedico) {
		super();
		this.idCitas = idCitas;
		this.fecha = fecha;
		this.hora = hora;
		this.causa = causa;
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
	}
	public int getIdCitas() {
		return idCitas;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public String getHora() {
		return hora;
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
	public void setIdCitas(int idCitas) {
		this.idCitas = idCitas;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	public void setHora(String hora) {
		this.hora = hora;
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
