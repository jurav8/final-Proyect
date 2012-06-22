package org.ssj.gestordepacientes.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;;

@Entity
public class ResultadoDeLaboratorio {

	private int idPruebaLaboratorio;
	private int idPaciente;
	private int idPrueba;
	private String Resultado;
	
	@Id
	public int getIdPruebaLaboratorio() {
		return idPruebaLaboratorio;
	}
	@Id
	public int getIdPaciente() {
		return idPaciente;
	}
	@Id
	public int getIdPrueba() {
		return idPrueba;
	}
	public String getResultado() {
		return Resultado;
	}
	public void setIdPruebaLaboratorio(int idPruebaLaboratorio) {
		this.idPruebaLaboratorio = idPruebaLaboratorio;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public void setIdPrueba(int idPrueba) {
		this.idPrueba = idPrueba;
	}
	public void setResultado(String resultado) {
		Resultado = resultado;
	}
	
	
}
