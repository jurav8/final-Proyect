package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResultadoDeLaboratorio {

	@Id
	private int idPruebaLaboratorio;
	private int idPadecimiento;
	private int idPrueba;
	private String resultado;
	
	public ResultadoDeLaboratorio(int idPruebaLaboratorio, int idPadecimiento,
			int idPrueba, String resultado) {
		super();
		this.idPruebaLaboratorio = idPruebaLaboratorio;
		this.idPadecimiento = idPadecimiento;
		this.idPrueba = idPrueba;
		this.resultado = resultado;
	}

	public int getIdPruebaLaboratorio() {
		return idPruebaLaboratorio;
	}

	public int getIdPadecimiento() {
		return idPadecimiento;
	}

	public int getIdPrueba() {
		return idPrueba;
	}

	public String getResultado() {
		return resultado;
	}

	public void setIdPruebaLaboratorio(int idPruebaLaboratorio) {
		this.idPruebaLaboratorio = idPruebaLaboratorio;
	}

	public void setIdPadecimiento(int idPadecimiento) {
		this.idPadecimiento = idPadecimiento;
	}

	public void setIdPrueba(int idPrueba) {
		this.idPrueba = idPrueba;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
}
