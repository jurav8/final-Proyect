package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaDeUsuarios extends JInternalFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public VentanaDeUsuarios() {
		setClosable(true);
		setTitle("Usuarios");
		setFrameIcon(new ImageIcon(VentanaDeUsuarios.class.getResource("/Imagenes/icons/Add-Male-User-icon.png")));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo de empleado");
		lblNewLabel.setBounds(12, 12, 131, 16);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 33, 145, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Tel\u00E9fono");
		lblNombre.setBounds(12, 138, 55, 16);
		getContentPane().add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 159, 145, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 95, 145, 20);
		getContentPane().add(textField_2);
		
		JLabel lblApellido = new JLabel("Nombre");
		lblApellido.setBounds(12, 74, 55, 16);
		getContentPane().add(lblApellido);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(186, 95, 145, 20);
		getContentPane().add(textField_3);
		
		JLabel lblTelfono = new JLabel("Apellido");
		lblTelfono.setBounds(186, 74, 55, 16);
		getContentPane().add(lblTelfono);
		
		JLabel lblNewLabel_1 = new JLabel("Perfil");
		lblNewLabel_1.setBounds(186, 12, 55, 16);
		getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Asistente", "M\u00E9dico"}));
		comboBox.setBounds(186, 32, 145, 21);
		getContentPane().add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(186, 159, 145, 20);
		getContentPane().add(textField_4);
		
		JLabel lblCdula = new JLabel("C\u00E9dula");
		lblCdula.setBounds(186, 138, 55, 16);
		getContentPane().add(lblCdula);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(12, 256, 55, 16);
		getContentPane().add(lblDireccin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 278, 319, 62);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setBounds(96, 200, 72, 16);
		getContentPane().add(lblEspecialidad);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setBounds(96, 219, 144, 22);
		getContentPane().add(comboBox_1);
		
		JButton button = new JButton("Aceptar");
		button.setIcon(new ImageIcon(VentanaDeUsuarios.class.getResource("/Imagenes/icons/Actions-dialog-ok-apply-icon.png")));
		button.setBounds(40, 365, 119, 34);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setIcon(new ImageIcon(VentanaDeUsuarios.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		button_1.setBounds(183, 365, 119, 34);
		getContentPane().add(button_1);
	}
}
