package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class VentanaDeCitas extends JInternalFrame{
	public VentanaDeCitas() {
		setClosable(true);
		setResizable(false);
		setTitle("Citas");
		getContentPane().setLayout(null);
		setSize(422,280);
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setBounds(10, 27, 61, 14);
		getContentPane().add(lblPaciente);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(61, 24, 138, 20);
		getContentPane().add(comboBox);
		
		JLabel lblMdico = new JLabel("M�dico");
		lblMdico.setBounds(223, 27, 46, 14);
		getContentPane().add(lblMdico);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(267, 24, 138, 20);
		getContentPane().add(comboBox_1);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(10, 69, 46, 14);
		getContentPane().add(lblFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(61, 69, 138, 20);
		getContentPane().add(dateChooser);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(223, 69, 46, 14);
		getContentPane().add(lblHora);
		
		JSpinField spinField = new JSpinField();
		spinField.setMinimum(12);
		spinField.setValue(12);
		spinField.setBounds(267, 69, 61, 20);
		getContentPane().add(spinField);
		
		JSpinField spinField_1 = new JSpinField();
		spinField_1.setMinimum(60);
		spinField_1.setValue(60);
		spinField_1.setBounds(344, 69, 61, 20);
		getContentPane().add(spinField_1);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(334, 70, 21, 14);
		getContentPane().add(label);
		
		JLabel lblCausa = new JLabel("Causa");
		lblCausa.setBounds(10, 115, 46, 14);
		getContentPane().add(lblCausa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 115, 343, 63);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setIcon(new ImageIcon(VentanaDeCitas.class.getResource("/Imagenes/icons/Actions-dialog-ok-apply-icon.png")));
		btnAceptar.setBounds(80, 204, 119, 34);
		getContentPane().add(btnAceptar);
		
		JButton btnCacelar = new JButton("Cancelar");
		btnCacelar.setIcon(new ImageIcon(VentanaDeCitas.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		btnCacelar.setBounds(223, 204, 119, 34);
		getContentPane().add(btnCacelar);
	}
}
