package org.ssj.gestordepacientes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.ssj.gestordepacientes.Pruebas.Medico;
import org.ssj.gestordepacientes.Pruebas.Persona;

public class Sistema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
//		config.addAnnotatedClass(Alergia.class);
//		config.addAnnotatedClass(Asistentes.class);
//		config.addAnnotatedClass(Citas.class);
//		config.addAnnotatedClass(Especialidad.class);
//		config.addAnnotatedClass(Medico.class);
//		config.addAnnotatedClass(Paciente.class);
//		config.addAnnotatedClass(Padecimientos.class);
//		config.addAnnotatedClass(PruebaDeLaboratorio.class);
//		config.addAnnotatedClass(Recetas.class);
//		config.addAnnotatedClass(ResultadoDeLaboratorio.class);
//		config.addAnnotatedClass(Usuario.class);
		//
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Medico.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory fact = config.buildSessionFactory();
		Session session = fact.getCurrentSession();
		session.beginTransaction();

		Persona per = new Persona();
		per.setApellido("as");
		per.setCedula("a");
		per.setDireccion("asdfgh");
		per.setNombre("julio");
		per.setTelefonoCasa("a");
		per.setTelefonoCelular("234");
		Medico medico = new Medico(1, 1, per);
				
				session.save(medico);
		session.getTransaction().commit();

		
	}

}
