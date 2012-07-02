package org.proyectofinal.gestorpacientes.modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Paciente")
public class Paciente extends Persona {

	private GregorianCalendar fechaNacimiento;
	private int fumador;
	private String nombreFoto;
	@OneToMany(mappedBy="alergiaPaciente",targetEntity=Alergia.class,cascade=CascadeType.ALL)
	private List<Alergia> alergia= new ArrayList<>();
	@OneToMany(mappedBy="padecimientoPaciente",targetEntity=Padecimientos.class,cascade=CascadeType.ALL)
	private List<Padecimientos> padecimientos;
	
	public GregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public int getFumador() {
		return fumador;
	}
	public String getNombreFoto() {
		return nombreFoto;
	}
	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setFumador(int fumador) {
		this.fumador = fumador;
	}
	public void setNombreFoto(String nombreFoto) {
		this.nombreFoto = nombreFoto;
	}
	public List<Alergia> getAlergia() {
		return alergia;
	}
	public List<Padecimientos> getPadecimientos() {
		return padecimientos;
	}
	public void setAlergia(List<Alergia> alergia) {
		this.alergia = alergia;
	}
	public void setPadecimientos(List<Padecimientos> padecimientos) {
		this.padecimientos = padecimientos;
	}
	
	
}
