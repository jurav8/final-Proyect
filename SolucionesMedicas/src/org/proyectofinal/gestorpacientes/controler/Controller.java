package org.proyectofinal.gestorpacientes.controler;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.proyectofinal.gestorpacientes.modelo.Alergia;
import org.proyectofinal.gestorpacientes.modelo.Asistentes;
import org.proyectofinal.gestorpacientes.modelo.Citas;
import org.proyectofinal.gestorpacientes.modelo.Especialidad;
import org.proyectofinal.gestorpacientes.modelo.Medico;
import org.proyectofinal.gestorpacientes.modelo.Paciente;
import org.proyectofinal.gestorpacientes.modelo.Padecimientos;
import org.proyectofinal.gestorpacientes.modelo.Persona;
import org.proyectofinal.gestorpacientes.modelo.PruebaDeLaboratorio;
import org.proyectofinal.gestorpacientes.modelo.Recetas;
import org.proyectofinal.gestorpacientes.modelo.ResultadoDeLaboratorio;
import org.proyectofinal.gestorpacientes.modelo.Usuario;

public class Controller {
	
	private static Controller instancia;
	private AnnotationConfiguration config;
	private SessionFactory factory;
	private Session session;
	
	private Controller(){
		
		config = new AnnotationConfiguration();
		config.addAnnotatedClass(Alergia.class);
		config.addAnnotatedClass(Asistentes.class);
		config.addAnnotatedClass(Citas.class);
		config.addAnnotatedClass(Especialidad.class);
		config.addAnnotatedClass(Medico.class);
		config.addAnnotatedClass(Paciente.class);
		config.addAnnotatedClass(Padecimientos.class);
		config.addAnnotatedClass(Persona.class);
		config.addAnnotatedClass(PruebaDeLaboratorio.class);
		config.addAnnotatedClass(Recetas.class);
		config.addAnnotatedClass(ResultadoDeLaboratorio.class);
		config.addAnnotatedClass(Usuario.class);
		config.configure("hibernate.cfg.xml");
		
//		new SchemaExport(config).create(true, true);
		
		factory = config.buildSessionFactory();
		session = factory.getCurrentSession();
		session.beginTransaction();
	}
	
	public static Controller getEnlace(){
		if(instancia == null)
			instancia = new Controller();
		
		return instancia;
	}
	
	public void crearMedico(String nombre, String apellido,String telefonoCasa,String telefonoCelular, String direccion,String cedula,
							Usuario usuario,ArrayList<Especialidad> especialidades){
		
		Medico medico = new Medico();
		medico.setApellido(apellido);
		medico.setCedula(cedula);
		medico.setDireccion(direccion);
		medico.setNombre(nombre);
		medico.setTelefonoCasa(telefonoCasa);
		medico.setTelefonoCelular(telefonoCelular);
		medico.setUsuario(usuario);
		medico.setEspecialidades(especialidades);
		
		for(Especialidad especialidad :especialidades ){
			especialidad.setMedico(medico);
			session.save(especialidad);
		}	
		session.save(medico);
		session.save(usuario);
		
		session.getTransaction().commit();
	}
	
	public void crearPaciente(String nombre,String apellido, String telefonoCasa, String telefonoCelular,
			String direccion, String cedula,GregorianCalendar fechaNacimiento,int fumador,	
			String nombreFoto, ArrayList<Alergia> alergias, ArrayList<Padecimientos> padecimientos ){
		
		Paciente paciente = new Paciente();
		paciente.setApellido(apellido);
		paciente.setCedula(cedula);
		paciente.setDireccion(direccion);
		paciente.setNombre(nombre);
		paciente.setTelefonoCasa(telefonoCasa);
		paciente.setTelefonoCelular(telefonoCelular);
		paciente.setFechaNacimiento(fechaNacimiento);
		paciente.setFumador(fumador);
		paciente.setNombreFoto(nombreFoto);
		paciente.setPadecimientos(padecimientos);
		paciente.setAlergia(alergias);
		
		for(Alergia alergia : alergias){
			alergia.setPaciente(paciente);
			session.save(alergia);
		}
		for(Padecimientos padecimiento:  padecimientos){
			padecimiento.setPadecimientoPaciente(paciente);
			session.save(padecimiento);
		}
		
		session.save(paciente);
		session.getTransaction().commit();
	}
	
	public void crearAsistente(String nombre,String apellido,String telefonoCasa,String telefonoCelular,String direccion,String cedula,
								Usuario usuario){
		
		Asistentes asistente = new Asistentes();
		asistente.setApellido(apellido);
		asistente.setCedula(cedula);
		asistente.setDireccion(direccion);
		asistente.setNombre(nombre);
		asistente.setTelefonoCasa(telefonoCasa);
		asistente.setTelefonoCelular(telefonoCelular);
		asistente.setUsuario(usuario);
		
		session.save(usuario);
		session.save(asistente);
		session.getTransaction().commit();
	}
	
	public void crearCitas(GregorianCalendar fecha, String hora,String causa,Medico medico,Paciente paciente){
		Citas cita = new Citas();
		cita.setCausa(causa);
		cita.setFecha(fecha);
		cita.setHora(hora);
		cita.setIdMedico(medico);
		cita.setIdPaciente(paciente);
		
		session.save(cita);
		session.getTransaction().commit();
	}
	
	public void crearPruebaLaboratorio(String nombreDeLaPrueba){
		 
		PruebaDeLaboratorio prueba = new PruebaDeLaboratorio();
		prueba.setNombreDeLaPrueba(nombreDeLaPrueba);
		
		session.save(prueba);
		session.getTransaction().commit();
	}
	
	public void crearRecetas(String medicamentos, Paciente idPaciente, Padecimientos idPadecimientos){
	
		Recetas receta = new Recetas(medicamentos);
		receta.setIdPadecimientos(idPadecimientos);
		receta.setIdPaciente(idPaciente);
		
		session.save(receta);
		session.getTransaction().commit();
	}
	
	public void crearResultadoDeLaboratorio(String resultado, Paciente idPaciente , PruebaDeLaboratorio idPruebaLaboratorio){
	
		ResultadoDeLaboratorio resultadoLab = new ResultadoDeLaboratorio(resultado);
		resultadoLab.setIdPaciente(idPaciente);
		resultadoLab.setIdPruebaLaboratorio(idPruebaLaboratorio);
		
		session.save(resultadoLab);
		session.getTransaction().commit();
	}
	
	public Medico consultarMedico(int id){
		return (Medico) session.get(Medico.class, id);
	}
	
	public Paciente consultarPaciente(int id){
		return (Paciente) session.get(Paciente.class, id);
	}
	
	public Padecimientos consultarPadecimiento(int id){
		return (Padecimientos) session.get(Padecimientos.class, id);
	}
	
	public PruebaDeLaboratorio consultarPruebaDeLaboratorio(int id){
		return (PruebaDeLaboratorio) session.get(PruebaDeLaboratorio.class, id);
	}
	
	public Citas consultarCitas(int id){
		return (Citas) session.get(Citas.class, id);
	}
	
	public void modificar(Object objeto){
		session.update(objeto);
		session.getTransaction().commit();
	}
	
}
