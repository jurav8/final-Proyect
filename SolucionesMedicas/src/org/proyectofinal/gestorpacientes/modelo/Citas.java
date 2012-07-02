package org.proyectofinal.gestorpacientes.modelo;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceUnit;

import org.hibernate.annotations.GenericGenerator;

@Entity
@PersistenceUnit(name="priueba")
public class Citas {
	
	@Id
	@GenericGenerator(name="citas" , strategy="increment")
	@GeneratedValue(generator="citas")
	private int idCitas;
	private GregorianCalendar fecha;
	private String hora;
	private String causa;
	@OneToOne
	@JoinColumn(name = "paciente_id")
	private Paciente idPaciente;
	@OneToOne
	@JoinColumn(name = "medico_id")
	private Medico idMedico;
	
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

	public Medico getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Medico idMedico) {
		this.idMedico = idMedico;
	}

	public Paciente getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	

}
