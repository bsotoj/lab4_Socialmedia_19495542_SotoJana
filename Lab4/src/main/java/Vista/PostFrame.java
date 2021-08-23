/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Model.SocialNetwork;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Publicacion;
import Model.Usuario;
import java.util.Date;

/**
 *
 * @author Bastian
 */
public class PostFrame extends javax.swing.JFrame {

    private LoggedOptionFrame ventanaOpciones;
    private SocialNetwork redSocial;
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolverAtras = new javax.swing.JButton();
        btnPostAction = new javax.swing.JButton();
        txtTipoPublicacion = new javax.swing.JTextField();
        txtContenidoPublicacion = new javax.swing.JTextField();
        txtUsuariosDirigidos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Has seleccionado la opcion Post");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de publicacion: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Contenido de la publicacion: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usuarios dirigidos:  ");

        btnVolverAtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVolverAtras.setText("Volver atras");
        btnVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAtrasActionPerformed(evt);
            }
        });

        btnPostAction.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPostAction.setText("Post!");
        btnPostAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addComponent(btnPostAction, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContenidoPublicacion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuariosDirigidos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTipoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtContenidoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtUsuariosDirigidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(141, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPostAction, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public PostFrame(LoggedOptionFrame ventanaOpciones, SocialNetwork redSocial) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ventanaOpciones = ventanaOpciones;
        this.redSocial = redSocial;
      //  boolean activo = redSocial.existeUsuarioSesionActiva();
       // System.out.println(redSocial.getUsuariosRedSocial().size());
      
        
    }
    /**
     * Evento volver a la ventana anterior
     * @param evt 
     * @return void
     */
    private void btnVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtrasActionPerformed
        this.setVisible(false);
        ventanaOpciones.setVisible(true);
    }//GEN-LAST:event_btnVolverAtrasActionPerformed

    /**
     * Metodo agregar nombres de usuarios a una lista
     * @param lista
     * @param arregloStrings 
     * @return void
     */
      public void agregarUsuariosAListaUsuarios(List<String> lista, String[] arregloStrings){
            for(String stringActual : arregloStrings){
                lista.add(stringActual);
            }
    }
    
    /**
     * Evento realizar un post
     * @param evt 
     * @return void
     */
      
    private void btnPostActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionActionPerformed
       String tipoPost = txtTipoPublicacion.getText();
       String contenidoPost = txtContenidoPublicacion.getText();
       String usuariosDirigidos = txtUsuariosDirigidos.getText(); 
        boolean respuesta = redSocial.existeUsuarioSesionActiva();
        System.out.println(respuesta);
        //redSocial.post(tipoPost,contenidoPost);
        // JOptionPane.showMessageDialog(this, "No hay datos","Error de autenticacion",JOptionPane.ERROR_MESSAGE);
        if("".equals(tipoPost) || "".equals(contenidoPost)){
            JOptionPane.showMessageDialog(this,"Casillas vacias para publicar","Error post",JOptionPane.ERROR_MESSAGE);
        
        }
        
        else{
            //post dirigido al mismo usuario
            if("".equals(usuariosDirigidos)){
                if(redSocial.post(tipoPost, contenidoPost)){
                JOptionPane.showMessageDialog(this, "Se ha hecho la publicacion en el propio muro");
                
                }      
                else{
                       JOptionPane.showMessageDialog(this,"Publicacion ya existente","Error post",JOptionPane.ERROR_MESSAGE);
                        }
            }
            
            else{
                List<String> listaUsuarios = new ArrayList<>();
                String[] arrayDeStrings = usuariosDirigidos.split(" ",0);
                agregarUsuariosAListaUsuarios(listaUsuarios,arrayDeStrings);
                if(redSocial.post(tipoPost,contenidoPost,listaUsuarios)){
                JOptionPane.showMessageDialog(this, "Se ha hecho la publicacion en el muro de los usuarios seleccionados");    
                
                }
                
                else{
                  JOptionPane.showMessageDialog(this,"El/los usuario(s) al que se desea publicar no existe(n)","Error post",JOptionPane.ERROR_MESSAGE);  
                }
            }
        
        }
      
    }//GEN-LAST:event_btnPostActionActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPostAction;
    private javax.swing.JButton btnVolverAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtContenidoPublicacion;
    private javax.swing.JTextField txtTipoPublicacion;
    private javax.swing.JTextField txtUsuariosDirigidos;
    // End of variables declaration//GEN-END:variables
}
