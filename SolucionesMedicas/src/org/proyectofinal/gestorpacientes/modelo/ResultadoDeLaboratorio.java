package org.proyectofinal.gestorpacientes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ResultadoDeLaboratorio {

	@Id
	@GenericGenerator(name="persona" , strategy="increment")
	@GeneratedValue(generator="persona")
	private int idResultadoLaboratorio;
	@OneToOne
	@JoinColumn(name = "pruebaLaboratorio_id")
	private PruebaDeLaboratorio idPruebaLaboratorio;
	@OneToOne
	@JoinColumn(name = "paciente_id")
	private Paciente idPaciente;
	private String resultado;
	
	public ResultadoDeLaboratorio(String resultado) {
		super();
		this.resultado = resultado;
	}

	public int getIdResultadoLaboratorio() {
		return idResultadoLaboratorio;
	}

	public void setIdResultadoLaboratorio(int idResultadoLaboratorio) {
		this.idResultadoLaboratorio = idResultadoLaboratorio;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public Paciente getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}

	public PruebaDeLaboratorio getIdPruebaLaboratorio() {
		return idPruebaLaboratorio;
	}

	public void setIdPruebaLaboratorio(PruebaDeLaboratorio idPruebaLaboratorio) {
		this.idPruebaLaboratorio = idPruebaLaboratorio;
	}
	
	
}
