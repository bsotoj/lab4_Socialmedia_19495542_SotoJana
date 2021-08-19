package com.paradigmas.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.paradigmas.models.SocialNetwork;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField userTextField;
	private JPasswordField passwordField;
	public SocialNetwork redSocial = new SocialNetwork("manc ave");
	
	
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel userLabel = new JLabel("Username");
		
		JLabel passwordLabel = new JLabel("Password");
		
		userTextField = new JTextField();
		userTextField.setColumns(10);
		
		JButton registerButton = new JButton("Registrarse");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonRegisterClickeado();
			}
		});
		
		passwordField = new JPasswordField();
		
		JButton loginButton = new JButton("Iniciar sesion");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonLoginClickeado();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(userLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordLabel))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField, 174, 174, 174)
								.addComponent(userTextField, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(146)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(loginButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(registerButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
					.addContainerGap(132, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(66)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(userLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(userTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordLabel)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(loginButton, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		

		
	}
	private void botonRegisterClickeado() {
		String usernameRegister = userTextField.getText();
		String passwordRegister = String.valueOf(passwordField.getPassword());
		if(redSocial.register(usernameRegister, passwordRegister)){
			System.out.println("Success!");
			JOptionPane.showMessageDialog(this,"Usuario " + usernameRegister + " registrado!");
		}
		else {
			JOptionPane.showMessageDialog(this, "Error de register", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void botonLoginClickeado() {
		String usernameLogin = userTextField.getText();
		String passwordLogin = String.valueOf(passwordField.getPassword());
		if(redSocial.login(usernameLogin, passwordLogin)) {
			boolean respuesta = redSocial.existeUsuarioSesionActiva(); 
			System.out.println(this.redSocial.getUsuarioSesionActiva().getNombreUsuario());
			OptionFrame ventanaOpciones = new OptionFrame(this,redSocial);
			this.setVisible(false);
			ventanaOpciones.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(this, "Error de login", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
