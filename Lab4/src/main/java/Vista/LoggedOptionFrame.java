/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Model.Publicacion;
import Model.SocialNetwork;
import Model.Usuario;

/**
 *
 * @author Bastian
 */
public class LoggedOptionFrame extends javax.swing.JFrame {
    private GUI ventanaLogin; 
    private SocialNetwork redSocial; 
    /**
     * Creates new form LoggedOptionFrame
     */
    public LoggedOptionFrame(GUI ventanaLogin, SocialNetwork redSocial) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ventanaLogin = ventanaLogin; 
        this.redSocial = redSocial; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUsuarioSesionActiva = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnPublicaciones = new javax.swing.JButton();
        btnPost = new javax.swing.JButton();
        btnFollow = new javax.swing.JButton();
        btnShare = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUsuarioSesionActiva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUsuarioSesionActiva.setText("Estado usuario actual");
        btnUsuarioSesionActiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioSesionActivaActionPerformed(evt);
            }
        });

        btnUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnPublicaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPublicaciones.setText("Publicaciones");
        btnPublicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicacionesActionPerformed(evt);
            }
        });

        btnPost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPost.setText("Post");

        btnFollow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFollow.setText("Follow");

        btnShare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnShare.setText("Share");

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setText("Cerrar sesion");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUsuarioSesionActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPublicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(btnShare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnFollow, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarioSesionActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPublicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPost, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnFollow, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnShare, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioSesionActivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioSesionActivaActionPerformed
        boolean respuesta = redSocial.existeUsuarioSesionActiva();
        if(respuesta){
            String usuarioSesionActiva = redSocial.getUsuarioSesionActiva().userSesionActivaToString();
            jTextArea1.setText(usuarioSesionActiva);
        }
    }//GEN-LAST:event_btnUsuarioSesionActivaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        redSocial.logout();
        this.setVisible(false);
        ventanaLogin.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        
        String usuariosRedSocial = "";
        usuariosRedSocial = usuariosRedSocial + "Usuarios de la red social: " + '\n';
        for(Usuario usuarioActual : redSocial.getUsuariosRedSocial()){
            usuariosRedSocial = usuariosRedSocial + usuarioActual.usuarioToString() + '\n';
        }
        jTextArea1.setText(usuariosRedSocial);
      
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnPublicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicacionesActionPerformed
        String publicacionesRedSocial = "";
        publicacionesRedSocial = publicacionesRedSocial + "Publicaciones de la red social: " + '\n';
        for(Publicacion publicacionActual: redSocial.getPublicacionesRedSocial()){
            publicacionesRedSocial = publicacionesRedSocial + publicacionActual.publicacionToString() + '\n';
        }
        
        jTextArea1.setText(publicacionesRedSocial);
    }//GEN-LAST:event_btnPublicacionesActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFollow;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPost;
    private javax.swing.JButton btnPublicaciones;
    private javax.swing.JButton btnShare;
    private javax.swing.JButton btnUsuarioSesionActiva;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
