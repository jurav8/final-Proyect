package org.proyectofinal.gestorpacientes.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="medico")
public class Medico extends Persona{

	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	@OneToMany(mappedBy="medico",targetEntity=Especialidad.class,fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Especialidad> especialidades; 
	
	public Medico(){
		especialidades = new ArrayList<Especialidad>();
	}
	
	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}	
	
	
	
}
