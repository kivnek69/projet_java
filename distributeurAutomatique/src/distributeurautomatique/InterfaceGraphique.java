
package distributeurautomatique;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;


/*
 * @author rafik et Mohaned
 */


public class InterfaceGraphique extends javax.swing.JFrame {
    //Attributs
    private static int sommeInitiale = 20;
    private static int total = 20;
    private static boolean test = true; 
    private static boolean test_ = true;
        
    
    
    public InterfaceGraphique() {
        initComponents();
        cacher_bouton();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jFrame2 = new javax.swing.JFrame();
        jButton11 = new javax.swing.JButton();
        jFrame3 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        jFrame1.setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/clown.gif"))); // NOI18N

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jFrame2.setResizable(false);

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setText("Insérez votre carte");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/merci.gif"))); // NOI18N

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel4)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("5€");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("10€");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 0));
        jButton3.setText("20€");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 255, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Valider");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Annuler");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Précédent");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton8.setText("Consulter");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton9.setText("Déposer");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton10.setText("Retirer");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setText("Menu");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton12.setText("Retirer la carte");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Page d'accueil
    public static void pageDaccueil(){
        jFrame1.setVisible(true);
        jFrame1.setSize(800, 600);        
        jFrame1.setLocation(180, 100);
        jFrame2.setSize(200, 600);
        jFrame2.setVisible(true);
        jFrame2.setLocation(988, 100);
   
    }
    
    
    //page d'au revoir
    public static void pageAurevoir(){
        jFrame3.setVisible(true);
        jFrame3.setSize(807, 610);        
        jFrame3.setLocation(180, 95);          
        jLabel4.setVisible(true);
    }
    
    //petite page qui nous sert pour l'insertion et le retrait de la carte
    public static void pageInsertion(){
        jFrame2.dispose();
        jFrame2.setSize(200, 600);
        jFrame2.setVisible(true);
        jFrame2.setLocation(988, 100);
        jButton11.setText("Insérez votre carte");
    }
    
    //Ajouter de l'argent 
    private int ajout_somme(int sommeArgent){
        //somme initiale de 20€ = 20€+ (5€ ou 10€ ou 20€)
        sommeInitiale = sommeInitiale + sommeArgent;        
        //on renvoit la somme totale 
        return sommeInitiale;
    }
    
    //retirer de l'argent
    private int retirer_somme(int sommeArgent){
        //somme initiale de 20€ = 20€+ (5€ ou 10€ ou 20€)
        sommeInitiale = sommeInitiale - sommeArgent;        
        //la somme ne doit pas être négative
        if(sommeArgent>sommeInitiale){
            sommeInitiale = sommeInitiale;            
        }
        
        //on renvoit la somme totale 
        return sommeInitiale;
    }
    
   //Annuler une quelconque opération 
    private int clickAnnuler(int sommeArgent){
        sommeInitiale = sommeInitiale - sommeArgent;        
        //on renvoit la somme totale 
        return sommeInitiale;
    }
    
   //Activation des boutons pour déposer ou retirer de l'argent
    private void activer_bouton(){
        jButton3.setEnabled(true);
        jButton2.setEnabled(true);
        jButton1.setEnabled(true);
    }
    
    
    //désactiver le bouton dont la valeur € superieure à la valeur totale existant sur la carte
    private void desactiver_bouton(){
        if(total<Ajout.getVingt()){
            jButton3.setEnabled(false);
        } 
        
        if(total<Ajout.getDix()){
            jButton3.setEnabled(false);
            jButton2.setEnabled(false);
        } 
        
        if(total<Ajout.getCinq()){
            jButton3.setEnabled(false);
            jButton2.setEnabled(false);
            jButton1.setEnabled(false);
            
        }
    }
    
    //fonction pour cacher les boutons initulisables dans certaines opérations
    private void cacher_bouton(){
        jButton1.hide();
        jButton2.hide();
        jButton3.hide();
        jButton4.hide();
        jButton5.hide();
        jButton6.hide();
        jButton7.hide();        
        jButton5.hide();
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton12.hide();
        jTextField1.hide();
        jTextField1.setText(total + "€");
    }
    
    //opération sur les boutons pour le dépot et le retrait d'argent
    private void operation_depot_retrait(){
        jButton8.hide();
        jButton9.hide();
        jButton10.hide();
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton6.setVisible(true);
        jTextField1.setVisible(true);
        jTextField1.setText(total + "€");
    }
    
    //Bouton 5€
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                       
        if(test){
        total = ajout_somme(Ajout.getCinq());  
        activer_bouton();
        jTextField1.setText(total + "€");
        
       }else{
           total = retirer_somme(Ajout.getCinq());  
            //desactiver le bouton une fois la valeur total est inferieure à la valeur à soustraire
           desactiver_bouton();           
           jTextField1.setText(total + "€");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    //Bouton 10€
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(test){
        total = ajout_somme(Ajout.getDix());  
        activer_bouton();
        jTextField1.setText(total + "€");
       }else{
           total = retirer_somme(Ajout.getDix()); 
           desactiver_bouton(); 
           jTextField1.setText(total + "€");
       }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //Bouton 20€
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
        if(test){
        total = ajout_somme(Ajout.getVingt());   
        activer_bouton();
        jTextField1.setText(total + "€");
       }else{
           total = retirer_somme(Ajout.getVingt());  
           desactiver_bouton(); 
           jTextField1.setText(total + "€");
       }
        
        //desactiver le bouton
        desactiver_bouton();
 
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    //Bouton Annuler
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        total = 20;
        sommeInitiale = 20;
        
        jTextField1.setText(total +"€");
        jButton4.setEnabled(true);
       
        //Reactiver les boutons après avoir annulé l'opération de retrait
        activer_bouton();
        
    }//GEN-LAST:event_jButton6ActionPerformed
    
    //Bouton Valider
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      jButton1.setVisible(false);
      jButton2.setVisible(false);
      jButton3.setVisible(false);
      jButton4.setEnabled(false);
      jButton5.setVisible(true);
      jButton7.setVisible(true);
      jTextField1.setVisible(false);
      jLabel1.setVisible(true);
      
      
     
    }//GEN-LAST:event_jButton4ActionPerformed
    
    //Bouton Précédent 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      jButton1.setVisible(true);
      jButton2.setVisible(true);
      jButton3.setVisible(true);
      jButton5.setVisible(false);
      jButton7.setVisible(false);
      jButton4.setEnabled(true);
      jTextField1.setVisible(true);
      
      
    }//GEN-LAST:event_jButton5ActionPerformed

    //Bouton déposer
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        test = true;
        
        if(total == 0){            
            activer_bouton();
        }        
        jLabel1.setText("");
        jLabel1.setVisible(true);
        jTextField1.setText(total +"€");
        jButton12.hide();
        
        operation_depot_retrait();
    }//GEN-LAST:event_jButton9ActionPerformed

    
    //Bouton Menu
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        cacher_bouton();
        jButton4.setEnabled(true);
        jButton12.setVisible(true);
        jLabel1.hide();
    }//GEN-LAST:event_jButton7ActionPerformed

    //Bouton Consulter
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        cacher_bouton();        
        jTextField1.setVisible(true);
        jLabel1.setText("  Votre solde est de ");
        jLabel1.setVisible(true);
        jTextField1.setText(total + "€");
        jButton12.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    //Bouton Retirer 
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        test = false;
        jLabel1.setText("");
        jLabel1.setVisible(true);
        jTextField1.setText(total +"€");
        jButton12.hide();
        
        this.operation_depot_retrait();  
       
    }//GEN-LAST:event_jButton10ActionPerformed

    public void gererFenetrePrincipale(){
        if(test_){
        InterfaceGraphique inter = new InterfaceGraphique();
        inter.setVisible(true);
        inter.setSize(800, 600);
        inter.setLocation(183, 100);
        
        }else{
            this.cacher_bouton();
            jLabel1.setVisible(false);
        }
       
    }
    
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //Pour chaque insertion(session), une somme de 20€ existe déja sur la carte
        total = 20;
        sommeInitiale = 20;
        
        jButton11.setText("Carte insérée");        
        jButton11.setEnabled(false);   
        jFrame1.setVisible(false);
      
        //on la crée une première fois la jFrame consulter déposer retirer
        this.gererFenetrePrincipale();
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        pageAurevoir();
        test_ = false;
        new Thread(new Runnable() {            
            @Override
            public void run() {
                try {     
                        Thread.sleep(5300);
                        jFrame3.setVisible(false);
                        jFrame1.setVisible(true);
                        jFrame1.setSize(800, 600);        
                        jFrame1.setLocation(181, 100);
                        //on active le bouton d'insertion de la carte
                        jButton11.setEnabled(true);
                        //on reinitialise le texte du bouton 
                        //jButton11.setText("Insérez vontre carte");
                        pageInsertion();
                                    
                 
                } catch (InterruptedException ex) {
                    Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
                }
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }).start();       
      
    }//GEN-LAST:event_jButton12ActionPerformed

    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGraphique().setVisible(true);
                
      
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    public static javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public static javax.swing.JFrame jFrame1;
    public static javax.swing.JFrame jFrame2;
    public static javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
