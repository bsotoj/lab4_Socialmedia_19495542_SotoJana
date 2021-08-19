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
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OptionFrame extends JFrame {

	private JPanel contentPane;
	private SocialNetwork redSocial;
	private Gui ventanaLogin; 

	public OptionFrame(Gui ventanaLogin,SocialNetwork redSocial) {
		this.redSocial = redSocial; 
		this.ventanaLogin = ventanaLogin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel optionTittleLabel = new JLabel("Selecciona una opccion");
		optionTittleLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton logoutButton = new JButton("Volver atras (aca hay que cerrar sesion)");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logoutButtonClicked();
			}
		});
		logoutButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(142, Short.MAX_VALUE)
					.addComponent(optionTittleLabel)
					.addGap(134))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(logoutButton)
					.addContainerGap(335, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(optionTittleLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(logoutButton)
					.addContainerGap(187, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void logoutButtonClicked() {
		this.setVisible(false);
		ventanaLogin.setVisible(true);
	}

}
