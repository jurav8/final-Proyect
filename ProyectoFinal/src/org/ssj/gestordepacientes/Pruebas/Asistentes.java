package org.ssj.gestordepacientes.Pruebas;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asistentes  extends Persona {

	@Id
	private int codigoEmpleado;
	private int idUsuario;
	
	
	public Asistentes(int codigoEmpleado, int idUsuario, String nombre, String apellido, String telefonoCasa, String telefonoCelular
			,String direccion, String cedula) {
		super(nombre,apellido,telefonoCasa,telefonoCelular,direccion,cedula);
		this.codigoEmpleado = codigoEmpleado;
		this.idUsuario = idUsuario;
	}
	
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
