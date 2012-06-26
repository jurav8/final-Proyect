package org.ssj.gestordepacientes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.ssj.gestordepacientes.Pruebas.Alergia;
import org.ssj.gestordepacientes.Pruebas.Asistentes;
import org.ssj.gestordepacientes.Pruebas.Citas;
import org.ssj.gestordepacientes.Pruebas.Especialidad;
import org.ssj.gestordepacientes.Pruebas.Medico;
import org.ssj.gestordepacientes.Pruebas.Paciente;
import org.ssj.gestordepacientes.Pruebas.Padecimientos;
import org.ssj.gestordepacientes.Pruebas.Persona;
import org.ssj.gestordepacientes.Pruebas.PruebaDeLaboratorio;
import org.ssj.gestordepacientes.Pruebas.Recetas;
import org.ssj.gestordepacientes.Pruebas.ResultadoDeLaboratorio;
import org.ssj.gestordepacientes.Pruebas.Usuario;

public class Sistema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfiguration config = new AnnotationConfiguration();
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
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Medico medico = new Medico();
		medico.setIdusuario(1);
		medico.setApellido("Lizardo");
		medico.setCedula("1");
		medico.setDireccion("casa");
		medico.setNombre("julio");
		medico.setTelefonoCasa("asdf");
		medico.setTelefonoCelular("asgsdfg");
		
				
		
		session.persist(medico);
		session.getTransaction().commit();
		System.gc();

		
	}

}
