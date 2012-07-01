package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import com.l2fprod.common.swing.JTaskPane;
import com.l2fprod.common.swing.JTaskPaneGroup;
import javax.swing.border.EtchedBorder;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaDeMantenimientos extends JInternalFrame{
	
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JButton btnNewButton;
	private JTable table_6;
	public VentanaDeMantenimientos() {
		setFrameIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Action-configure-iconpeq.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setClosable(true);
		setTitle("Utilidades");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_usuarios = new JPanel();
		tabbedPane.addTab("Usuarios", null, panel_usuarios, null);
		panel_usuarios.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(0, 65, 677, 354);
		panel_usuarios.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Nombre", "Apellido", "C\u00E9dula"
			}
		));
		scrollPane_6.setViewportView(table_6);
		
		JButton button = new JButton(" Agregar");
		button.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Action-edit-add-icon.png")));
		button.setBounds(80, 18, 113, 33);
		panel_usuarios.add(button);
		
		JButton button_1 = new JButton(" Editar");
		button_1.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Edit-icon.png")));
		button_1.setBounds(282, 18, 113, 33);
		panel_usuarios.add(button_1);
		
		JButton button_2 = new JButton(" Borrar");
		button_2.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		button_2.setBounds(486, 18, 113, 33);
		panel_usuarios.add(button_2);
		
		JPanel panel_pacientes = new JPanel();
		tabbedPane.addTab("Pacientes", null, panel_pacientes, null);
		panel_pacientes.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(0, 65, 678, 354);
		panel_pacientes.add(scrollPane);
		
		VentanaDePacientes vp=new VentanaDePacientes();
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id paciente", "Nombre", "Apellido", "C\u00E9dula", "Fumador"
			}
		));
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton(" Agregar");
		btnNewButton.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Action-edit-add-icon.png")));
		btnNewButton.setBounds(80, 18, 113, 33);
		panel_pacientes.add(btnNewButton);
		
		JButton btnEditar = new JButton(" Editar");
		btnEditar.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Edit-icon.png")));
		btnEditar.setBounds(282, 18, 113, 33);
		panel_pacientes.add(btnEditar);
		
		JButton btnBorrar = new JButton("  Borrar");
		btnBorrar.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		btnBorrar.setBounds(486, 18, 113, 33);
		panel_pacientes.add(btnBorrar);
		
		JPanel panel_citas = new JPanel();
		tabbedPane.addTab("Citas", null, panel_citas, null);
		panel_citas.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 65, 677, 354);
		panel_citas.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Paciente", "Fecha", "M\u00E9dico", "Hora"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnAgregar = new JButton(" Agregar");
		btnAgregar.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Action-edit-add-icon.png")));
		btnAgregar.setBounds(80, 18, 113, 33);
		panel_citas.add(btnAgregar);
		
		JButton btnEditar_1 = new JButton(" Editar");
		btnEditar_1.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Edit-icon.png")));
		btnEditar_1.setBounds(282, 18, 113, 33);
		panel_citas.add(btnEditar_1);
		
		JButton btnBorrar_1 = new JButton(" Borrar");
		btnBorrar_1.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		btnBorrar_1.setBounds(486, 18, 113, 33);
		panel_citas.add(btnBorrar_1);
		
		JPanel panel_padecimientos = new JPanel();
		tabbedPane.addTab("Padecimientos", null, panel_padecimientos, null);
		panel_padecimientos.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 65, 678, 354);
		panel_padecimientos.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"C\u00F3digo", "Nombre"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JButton button_3 = new JButton("Agregar");
		button_3.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Action-edit-add-icon.png")));
		button_3.setBounds(80, 18, 113, 33);
		panel_padecimientos.add(button_3);
		
		JButton button_4 = new JButton("Editar");
		button_4.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Edit-icon.png")));
		button_4.setBounds(282, 18, 113, 33);
		panel_padecimientos.add(button_4);
		
		JButton button_5 = new JButton("Borrar");
		button_5.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		button_5.setBounds(486, 18, 113, 33);
		panel_padecimientos.add(button_5);
		
		JPanel panel_recetas = new JPanel();
		tabbedPane.addTab("Recetas", null, panel_recetas, null);
		panel_recetas.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 65, 678, 354);
		panel_recetas.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Paciente", "Padecimientos", "Medicamentos"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JButton button_6 = new JButton("Agregar");
		button_6.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Action-edit-add-icon.png")));
		button_6.setBounds(58, 18, 113, 33);
		panel_recetas.add(button_6);
		
		JButton button_7 = new JButton("Editar");
		button_7.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Edit-icon.png")));
		button_7.setBounds(207, 18, 113, 33);
		panel_recetas.add(button_7);
		
		JButton button_8 = new JButton("Borrar");
		button_8.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		button_8.setBounds(361, 18, 113, 33);
		panel_recetas.add(button_8);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/printer-blue-icon.png")));
		btnImprimir.setBounds(510, 18, 113, 33);
		panel_recetas.add(btnImprimir);
		
		JPanel panel_pruebas = new JPanel();
		tabbedPane.addTab("Pruebas de laboratorio", null, panel_pruebas, null);
		panel_pruebas.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 65, 678, 354);
		panel_pruebas.add(scrollPane_4);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"C\u00F3digo", "Nombre de la prueba"
			}
		));
		scrollPane_4.setViewportView(table_5);
		
		JButton button_9 = new JButton("Agregar");
		button_9.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Action-edit-add-icon.png")));
		button_9.setBounds(80, 18, 113, 33);
		panel_pruebas.add(button_9);
		
		JButton button_10 = new JButton("Editar");
		button_10.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Edit-icon.png")));
		button_10.setBounds(282, 18, 113, 33);
		panel_pruebas.add(button_10);
		
		JButton button_11 = new JButton("Borrar");
		button_11.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		button_11.setBounds(486, 18, 113, 33);
		panel_pruebas.add(button_11);
		
		JPanel panel_resultados = new JPanel();
		tabbedPane.addTab("Resultados de pruebas de laboratorio", null, panel_resultados, null);
		panel_resultados.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 65, 678, 354);
		panel_resultados.add(scrollPane_5);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Paciente", "Prueba", "Resultados"
			}
		));
		scrollPane_5.setViewportView(table_4);
		
		JButton button_12 = new JButton("Agregar");
		button_12.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Action-edit-add-icon.png")));
		button_12.setBounds(80, 18, 113, 33);
		panel_resultados.add(button_12);
		
		JButton button_13 = new JButton("Editar");
		button_13.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Edit-icon.png")));
		button_13.setBounds(282, 18, 113, 33);
		panel_resultados.add(button_13);
		
		JButton button_14 = new JButton("Borrar");
		button_14.setIcon(new ImageIcon(VentanaDeMantenimientos.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		button_14.setBounds(486, 18, 113, 33);
		panel_resultados.add(button_14);
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
}
