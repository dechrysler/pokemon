package com.sfaci.pokemon.ui;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.sfaci.pokemon.base.Pokemon;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class Vista {

	JFrame ventana;
	public JTextField tfNombre;
	public JTextField tfNivel;
	public JTextField tfPeso;
	public JButton btAnadir;
	public JComboBox<Pokemon.Tipo> cbTipo;
	public JScrollPane scrollPane;
	public JList<Pokemon> lPokemons;
	public DefaultListModel<Pokemon> mPokemons;
	public JLabel lbImagen;

	public Vista() {
		
		ventana = new JFrame();
		ventana.setBounds(100, 100, 645, 487);
		ventana.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre*");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 31, 57, 14);
		ventana.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo");
		lblNewLabel_1.setBounds(10, 62, 46, 14);
		ventana.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nivel");
		lblNewLabel_2.setBounds(10, 93, 46, 14);
		ventana.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Peso");
		lblNewLabel_3.setBounds(10, 124, 46, 14);
		ventana.getContentPane().add(lblNewLabel_3);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(66, 28, 86, 20);
		ventana.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfNivel = new JTextField();
		tfNivel.setBounds(66, 90, 86, 20);
		ventana.getContentPane().add(tfNivel);
		tfNivel.setColumns(10);
		
		tfPeso = new JTextField();
		tfPeso.setBounds(66, 121, 86, 20);
		ventana.getContentPane().add(tfPeso);
		tfPeso.setColumns(10);
		
		btAnadir = new JButton("A\u00F1adir");
		btAnadir.setActionCommand("anadir");
		btAnadir.setBounds(63, 188, 89, 23);
		ventana.getContentPane().add(btAnadir);
		
		cbTipo = new JComboBox<>();
		cbTipo.setBounds(66, 59, 86, 20);
		ventana.getContentPane().add(cbTipo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(442, 31, 166, 180);
		ventana.getContentPane().add(scrollPane);
		
		lPokemons = new JList<>();
		scrollPane.setViewportView(lPokemons);
		
		
		lbImagen = new JLabel("");
		lbImagen.setIcon(new ImageIcon("C:\\Users\\AlumnoT\\Desktop\\450_1000.png"));
		lbImagen.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Imagen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		lbImagen.setBounds(88, 242, 356, 161);
		ventana.getContentPane().add(lbImagen);
		
		ventana.setLocationRelativeTo(null);
		
		mPokemons = new DefaultListModel<>();
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
}
