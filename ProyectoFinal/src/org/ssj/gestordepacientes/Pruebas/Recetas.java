package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recetas {
	
	@Id
	private int idReceta;
	private String medicamentos;
	private int idPadecimientos;
	private int idPaciente;
	
	public Recetas(int idReceta, String medicamentos, int idPadecimientos,
			int idPaciente) {
		super();
		this.idReceta = idReceta;
		this.medicamentos = medicamentos;
		this.idPadecimientos = idPadecimientos;
		this.idPaciente = idPaciente;
	}
	
	public int getIdReceta() {
		return idReceta;
	}
	public String getMedicamentos() {
		return medicamentos;
	}
	public int getIdPadecimientos() {
		return idPadecimientos;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}
	public void setIdPadecimientos(int idPadecimientos) {
		this.idPadecimientos = idPadecimientos;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
}
