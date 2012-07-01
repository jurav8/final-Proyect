package org.proyectofinal.gestorpacientes.modelo;

import java.util.ArrayList;
import java.util.Collection;

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
	private Collection<Especialidad> especialidades = new ArrayList<Especialidad>();
	
	public Collection<Especialidad> getEspecialidades() {
		return especialidades;
	}
	public void addEspecialidades(Especialidad especialidades) {
		this.especialidades.add(especialidades);
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
	
	
	
}
