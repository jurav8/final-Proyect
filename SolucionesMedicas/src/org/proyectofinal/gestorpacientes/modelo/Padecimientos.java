package org.proyectofinal.gestorpacientes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Padecimientos {
	
	@Id
	@GenericGenerator(name="persona" , strategy="increment")
	@GeneratedValue(generator="persona")
	private int idPadecimiento;
	private String nombre;
	@ManyToOne
	@JoinColumn(name="paciente_id")
	private Paciente padecimientoPaciente;

	public int getIdPadecimiento() {
		return idPadecimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setIdPadecimiento(int idPadecimiento) {
		this.idPadecimiento = idPadecimiento;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Paciente getPadecimientoPaciente() {
		return padecimientoPaciente;
	}
	public void setPadecimientoPaciente(Paciente padecimientoPaciente) {
		this.padecimientoPaciente = padecimientoPaciente;
	}
	
	

}
