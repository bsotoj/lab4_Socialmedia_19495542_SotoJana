/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Model.Publicacion;
import Model.SocialNetwork;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bastian
 */
public class ShareFrame extends javax.swing.JFrame {

    /**
     * Creates new form ShareFrame
     */
    private LoggedOptionFrame ventanaOpciones;
    private SocialNetwork redSocial;
    
    public ShareFrame(LoggedOptionFrame ventanaOpciones, SocialNetwork redSocial) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ventanaOpciones = ventanaOpciones;
        this.redSocial = redSocial;
    }
    
    private void mostrarPublicaciones(){
    String publicacionesRedSocial = "";
        publicacionesRedSocial = publicacionesRedSocial + "Publicaciones de la red social: " + '\n';
        for(Publicacion publicacionActual: redSocial.getPublicacionesRedSocial()){
            publicacionesRedSocial = publicacionesRedSocial + publicacionActual.publicacionToString() + '\n';
        }
    jTextArea1.setText(publicacionesRedSocial);
    }
    
     public void agregarUsuariosAListaUsuarios(List<String> lista, String[] arregloStrings){
            for(String stringActual : arregloStrings){
                lista.add(stringActual);
            }
    }
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
        btnShare = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtIDPost = new javax.swing.JTextField();
        txtUsuariosDestino = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Has seleccionado la opccion share");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID publicacion a compartir: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Usuarios destinatarios: ");

        btnShare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnShare.setText("Share!");
        btnShare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShareActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("Volver atras");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        txtIDPost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUsuariosDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDPost))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuariosDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(btnShare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIDPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUsuariosDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btnShare, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        mostrarPublicaciones();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       this.setVisible(false);
       ventanaOpciones.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnShareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShareActionPerformed
        //int i=Integer.parseInt(s); 
        String usuariosDestino = txtUsuariosDestino.getText();
        //JOptionPane.showMessageDialog(this,"Casillas vacias para publicar","Error post",JOptionPane.ERROR_MESSAGE);
        if("".equals(txtIDPost.getText())){
            JOptionPane.showMessageDialog(this, "Casilla de ID vacia", "Error share",JOptionPane.ERROR_MESSAGE);
        }
        else{
           int idPost = Integer.parseInt(txtIDPost.getText()); 
           if("".equals(usuariosDestino)){
               //share en el mismo muro
               if(redSocial.share(idPost)){
                   JOptionPane.showMessageDialog(this, "Se ha compartido la publicacion con ID: "+ idPost + " en el propio muro");
                   mostrarPublicaciones();
               
               }
               
               else{
                   //JOptionPane.showMessageDialog(this,"Publicacion ya existente","Error post",JOptionPane.ERROR_MESSAGE);
                   JOptionPane.showMessageDialog(this,"No se pudo compartir la publicacion", "Error share",JOptionPane.ERROR_MESSAGE);
                   
               
               }
           
           }
           
           else{
              //share hacia otros usuarios
              List<String> listaUsuarios = new ArrayList<>();
              String[] arrayDeStrings = usuariosDestino.split(" ",0);
              agregarUsuariosAListaUsuarios(listaUsuarios,arrayDeStrings);
              
              if(redSocial.share(idPost, listaUsuarios)){
                  //JOptionPane.showMessageDialog(this, "Se ha hecho la publicacion en el muro de los usuarios seleccionados");    
                  JOptionPane.showMessageDialog(this, "Se ha compartido la publicacion en el muro de los usuarios seleccionados");
                  mostrarPublicaciones();
                 
              }
              
              else{
              //ERROR
              //JOptionPane.showMessageDialog(this,"El/los usuario(s) al que se desea publicar no existe(n)","Error post",JOptionPane.ERROR_MESSAGE);  
                  JOptionPane.showMessageDialog(this, "Los usuarios ingresados no se encuentran en la lista de contactos", "Error share", JOptionPane.ERROR_MESSAGE);  

              }
           
           }
           
        }

    }//GEN-LAST:event_btnShareActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnShare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtIDPost;
    private javax.swing.JTextField txtUsuariosDestino;
    // End of variables declaration//GEN-END:variables
}
