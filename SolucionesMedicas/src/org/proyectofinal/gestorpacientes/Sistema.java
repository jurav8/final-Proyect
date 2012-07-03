package org.proyectofinal.gestorpacientes;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.proyectofinal.gestorpacientes.controler.Controller;
import org.proyectofinal.gestorpacientes.vista.VentanaPrincipal;

public class Sistema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Controller con = Controller.getEnlace(false,false);
		
//		Padecimientos pa = con.consultarPadecimiento(2);
//		con.eliminar(pa);

		
		System.gc();
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new VentanaPrincipal().setVisible(true);
	}

}