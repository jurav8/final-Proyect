package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaDePacientes extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public VentanaDePacientes() {
		setClosable(true);
		setFrameIcon(new ImageIcon(VentanaDePacientes.class.getResource("/Imagenes/icons/patient-icon.png")));
		setTitle("Pacientes");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setBounds(12, 12, 128, 142);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(152, 12, 55, 16);
		getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(206, 10, 206, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(152, 55, 55, 16);
		getContentPane().add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 53, 206, 20);
		getContentPane().add(textField_1);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(152, 100, 55, 16);
		getContentPane().add(lblTelfono);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(206, 98, 206, 20);
		getContentPane().add(textField_2);
		
		JLabel lblCdula = new JLabel("C\u00E9dula");
		lblCdula.setBounds(152, 146, 55, 16);
		getContentPane().add(lblCdula);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(206, 144, 206, 20);
		getContentPane().add(textField_3);
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.setBounds(12, 189, 55, 16);
		getContentPane().add(lblFoto);
		
		JButton btnNewButton = new JButton("Buscar ");
		btnNewButton.setIcon(new ImageIcon(VentanaDePacientes.class.getResource("/Imagenes/icons/search-icon.png")));
		btnNewButton.setBounds(299, 180, 113, 33);
		getContentPane().add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setBounds(45, 187, 231, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(12, 232, 55, 16);
		getContentPane().add(lblDireccin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 232, 340, 46);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(12, 305, 128, 16);
		getContentPane().add(lblFechaDeNacimiento);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(136, 303, 140, 22);
		getContentPane().add(dateChooser);
		
		JLabel lblFumador = new JLabel("Fumador");
		lblFumador.setBounds(294, 305, 55, 16);
		getContentPane().add(lblFumador);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Si", "No"}));
		comboBox.setBounds(350, 302, 62, 22);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Alergias");
		lblNewLabel_1.setBounds(12, 347, 55, 16);
		getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(71, 347, 340, 46);
		getContentPane().add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setIcon(new ImageIcon(VentanaDePacientes.class.getResource("/Imagenes/icons/Actions-dialog-ok-apply-icon.png")));
		btnAceptar.setBounds(90, 420, 113, 33);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(VentanaDePacientes.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		btnCancelar.setBounds(236, 420, 113, 33);
		getContentPane().add(btnCancelar);
	}
}
