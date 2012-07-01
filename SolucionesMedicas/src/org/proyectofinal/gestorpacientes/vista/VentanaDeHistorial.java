package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.toedter.calendar.JYearChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import java.beans.PropertyVetoException;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class VentanaDeHistorial extends JInternalFrame{
	private JTextField textField;
	public VentanaDeHistorial() {
		setFrameIcon(new ImageIcon(VentanaDeHistorial.class.getResource("/Imagenes/icons/History-Folder-Ash-icon.png")));
		setResizable(false);
		setTitle("Historial del paciente");
		getContentPane().setLayout(null);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(12, 44, 55, 16);
		getContentPane().add(lblFecha);
		
		JLabel lblCausa = new JLabel("Causa");
		lblCausa.setBounds(12, 97, 55, 16);
		getContentPane().add(lblCausa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 118, 256, 70);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.setBounds(12, 65, 256, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblObservaciones = new JLabel("Observaciones");
		lblObservaciones.setBounds(12, 200, 83, 16);
		getContentPane().add(lblObservaciones);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 220, 256, 70);
		getContentPane().add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JLabel lblRecetas = new JLabel("Recetas");
		lblRecetas.setBounds(12, 302, 83, 16);
		getContentPane().add(lblRecetas);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 322, 256, 70);
		getContentPane().add(scrollPane_2);
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane_2.setViewportView(textArea_2);
		
		JLabel lblResultadosDePruba = new JLabel("Resultados de pruebas de laboratorio");
		lblResultadosDePruba.setBounds(12, 404, 209, 16);
		getContentPane().add(lblResultadosDePruba);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 425, 256, 70);
		getContentPane().add(scrollPane_3);
		
		JTextArea textArea_3 = new JTextArea();
		scrollPane_3.setViewportView(textArea_3);
		
		JLabel lblFulanito = new JLabel("Fulanito de tal");
		lblFulanito.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblFulanito.setHorizontalAlignment(SwingConstants.CENTER);
		lblFulanito.setForeground(Color.GRAY);
		lblFulanito.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFulanito.setBounds(0, 12, 487, 20);
		getContentPane().add(lblFulanito);
		
		JTree tree = new JTree();
		tree.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tree.setBounds(283, 44, 192, 451);
		getContentPane().add(tree);
	}
}
