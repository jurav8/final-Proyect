package org.ssj.gestordepacientes.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recetas {

	private int idReceta;
	private String medicamento;
	private int idPadecimiento;
	private int idPaciente;
	
	@Id
	public int getIdReceta() {
		return idReceta;
	}
	public String getMedicamento() {
		return medicamento;
	}
	public int getIdPadecimiento() {
		return idPadecimiento;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public void setIdPadecimiento(int idPadecimiento) {
		this.idPadecimiento = idPadecimiento;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	
}
