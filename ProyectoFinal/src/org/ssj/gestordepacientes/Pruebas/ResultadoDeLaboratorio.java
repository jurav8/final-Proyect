package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ResultadoDeLaboratorio {

	@Id
	@GenericGenerator(name="persona" , strategy="increment")
	@GeneratedValue(generator="persona")
	private int idResultadoLaboratorio;
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

	public int getIdResultadoLaboratorio() {
		return idResultadoLaboratorio;
	}

	public void setIdResultadoLaboratorio(int idResultadoLaboratorio) {
		this.idResultadoLaboratorio = idResultadoLaboratorio;
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
