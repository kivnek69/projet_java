package LogicalView;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;

public class Learn extends javax.swing.JFrame {

    public int vari=0;
    public int lm = 0;

    public Learn() {
        initComponents();
        jTabbedPane7.setSelectedIndex(0);        
        logWrite("\t\t\t\t\t TimeTabling System");
        jProgressBar1.setIndeterminate(true);
        jComboBox2.addItem("Administrateur") ;
        jComboBox2.addItem("Enseignant") ;
        jComboBox2.addItem("Etudiant") ;
        jTextArea41.setVisible(false);
        jTable3.setVisible(true);
        jButton7.setVisible(true);

        Referentiel r = new Referentiel();
        DefaultListModel model = new DefaultListModel(),
            model1 = new DefaultListModel(),
            model3 = new DefaultListModel(),
            model4 = new DefaultListModel();

        for(int i = 0; i<r.listEnseignant.size(); i++){
                  model.addElement(""+r.listEnseignant.get(i).getNom()+" "+r.listEnseignant.get(i).getPrenom()+"");
        }
        jList1.setModel(model);
        
        for(int i = 0; i<r.listAllCours.size(); i++){
                  model1.addElement(""+r.listAllCours.get(i).getIntitule()+"");
        }
        jList3.setModel(model1);

        for(int i = 0; i<r.listAllGroupe.size(); i++){
                  jComboBox8.addItem(""+r.listAllGroupe.get(i).getNomGroupe()+" ");
        }

        for(int i = 0; i<r.listAllEtudiant.size(); i++){
                  model3.addElement(""+r.listAllEtudiant.get(i).nom+" "+r.listAllEtudiant.get(i).prenom+"");
        }
        jList6.setModel(model3);

        for(int i = 0; i<r.listAllCours.size(); i++){
                  model4.addElement(""+r.listAllCours.get(i).getIntitule()+"");
        }
        jList7.setModel(model4);

        jComboBox3.addItem("1"); jComboBox3.addItem("2"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jButton10 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jPanel30 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jLabel20 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jButton18 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField8 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jLabel57 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea41 = new javax.swing.JTextArea();
        jPanel20 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jComboBox16 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton25 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        jPanel32 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jScrollPane16 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel114 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jPanel34 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel87 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jPanel26 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jPanel35 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel90 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jCheckBox65 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jCheckBox67 = new javax.swing.JCheckBox();
        jCheckBox68 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        jCheckBox70 = new javax.swing.JCheckBox();
        jCheckBox71 = new javax.swing.JCheckBox();
        jCheckBox72 = new javax.swing.JCheckBox();
        jCheckBox73 = new javax.swing.JCheckBox();
        jCheckBox74 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        jLabel91 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel64 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane9.setViewportView(jTextArea5);

        jLabel5.setText("jLabel5");

        jLabel26.setText("jLabel4");

        jLabel47.setText("jLabel30");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programmation des modèles - C.DOUADI & R.BOUKELLA");
        setResizable(false);

        jTabbedPane7.setBackground(new java.awt.Color(153, 255, 153));
        jTabbedPane7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane7.setForeground(java.awt.Color.darkGray);

        jDesktopPane3.setBackground(new java.awt.Color(229, 226, 230));
        jDesktopPane3.setEnabled(false);

        jPanel14.setBackground(new java.awt.Color(214, 217, 223));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("T i m e T a b l e  V i e w");
        jLabel16.setEnabled(false);

        jTable3.setBackground(new java.awt.Color(214, 217, 223));
        jTable3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"        09h - 12h", null, null, null, null, null, null},
                {"        12h - 15h", null, null, null, null, null, null},
                {"        15h - 18h", null, null, null, null, null, null},
                {"        18h - 21h", null, null, null, null, null, null}
            },
            new String [] {
                "          Horaire", "          Lundi", "          Mardi", "          Mercredi", "          Jeudi", "          Vendredi", "          Samedi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setCellSelectionEnabled(true);
        jTable3.setOpaque(false);
        jTable3.setRowHeight(84);
        jTable3.setSelectionForeground(new java.awt.Color(229, 226, 230));
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setShowHorizontalLines(false);
        jTable3.setShowVerticalLines(false);
        jTable3.setUpdateSelectionOnSort(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jTable3.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jTable3AncestorResized(evt);
            }
        });
        jScrollPane8.setViewportView(jTable3);

        jLabel29.setText("Cours :");

        jLabel45.setText("  -");

        jLabel34.setText("  -");

        jLabel46.setText("  -");

        jLabel13.setText("A c t i v i t y   D e t a i l s");
        jLabel13.setEnabled(false);

        jLabel33.setText("Salle :");

        jLabel21.setText("Enseignant  :");

        jButton7.setBackground(new java.awt.Color(153, 255, 153));
        jButton7.setText("Next");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel50.setText("  -");

        jLabel76.setText("Groupe : ");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gilles Bernard", "Anna Pappa", "Suarez Jordan", "J.J Mariage" }));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Groupe 1", "Groupe 2", "Groupe 3", "Groupe 4", "Groupe 5" }));

        jLabel22.setText("Liste Enseignant  :");

        jLabel24.setText("Liste Groupe :");

        jButton19.setBackground(new java.awt.Color(153, 255, 153));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/Flg - Copie.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel24)
                .addGap(12, 12, 12)
                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel22)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel50)
                    .addComponent(jLabel29)
                    .addComponent(jLabel45)
                    .addComponent(jLabel21)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel46))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel14.setBounds(10, 10, 770, 510);
        jDesktopPane3.add(jPanel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane7.addTab("TimeTabling Manager", jDesktopPane3);

        jDesktopPane5.setBackground(new java.awt.Color(229, 226, 230));
        jDesktopPane5.setEnabled(false);
        jDesktopPane5.setFocusCycleRoot(false);

        jPanel30.setBackground(new java.awt.Color(214, 217, 223));
        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel30.setLayout(null);

        jLabel55.setText(" G r o u p e");
        jLabel55.setEnabled(false);
        jPanel30.add(jLabel55);
        jLabel55.setBounds(180, 110, 60, 20);

        jList1.setBackground(new java.awt.Color(-986896,true));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList1);

        jPanel30.add(jScrollPane5);
        jScrollPane5.setBounds(10, 30, 160, 110);

        jList3.setBackground(new java.awt.Color(-986896,true));
        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Programmation Fonctionnelle", "Analyse Numerique", "Logique", "Architecture des Ordinateurs", "Reseaux de neurones", "Methodologie de recherche" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList3.setToolTipText("");
        jScrollPane10.setViewportView(jList3);

        jPanel30.add(jScrollPane10);
        jScrollPane10.setBounds(180, 30, 300, 70);

        jLabel20.setText("C o u r s");
        jLabel20.setEnabled(false);
        jPanel30.add(jLabel20);
        jLabel20.setBounds(310, 10, 50, 14);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/ajout_dossier - Copie.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton11);
        jButton11.setBounds(340, 110, 40, 25);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/Flg - Copie.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton12);
        jButton12.setBounds(440, 110, 40, 25);

        jLabel54.setText("  T e a c h e r ' s    L i s t    V i e w");
        jLabel54.setEnabled(false);
        jPanel30.add(jLabel54);
        jLabel54.setBounds(10, 10, 160, 14);

        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        jPanel30.add(jComboBox8);
        jComboBox8.setBounds(240, 110, 80, 20);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/ajout_dossier - Copie - Copie.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton18);
        jButton18.setBounds(390, 110, 40, 25);

        jPanel30.setBounds(10, 230, 490, 150);
        jDesktopPane5.add(jPanel30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel31.setBackground(new java.awt.Color(214, 217, 223));
        jPanel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel66.setText("P e r s o n a l  d a t a");
        jLabel66.setEnabled(false);

        jLabel68.setText("Prénom :");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/ajout_dossier - Copie.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/Flg - Copie.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel69.setText("Date de naissance :");

        jLabel70.setText("Adresse :");

        jLabel71.setText("Titre :");

        jLabel72.setText("Charges :");

        jLabel73.setText("Cours par Semaine :");

        jLabel74.setText("Id : ");

        jLabel75.setText("Nom :");

        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField5.setForeground(new java.awt.Color(-986896,true));
        jTextField5.setText("                 JJ/MM/AAAA");
        jTextField5.setToolTipText("");

        jTextField6.setForeground(new java.awt.Color(-986896,true));
        jTextField6.setText("    CP");

        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctorant", "Maitre_Conference", "Professeur" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel7.setText("Lun  Mar Mer Jeu Ven Sam");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 10, 130, 14);

        jLabel8.setText("09h-12h");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 20, 40, 20);

        jLabel9.setText("18h-21h");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 80, 40, 20);

        jLabel11.setText("12h-15h");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 40, 40, 20);

        jLabel15.setText("15h-18h");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(10, 60, 40, 20);
        jPanel3.add(jCheckBox4);
        jCheckBox4.setBounds(70, 20, 20, 21);

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox5);
        jCheckBox5.setBounds(50, 20, 21, 21);
        jPanel3.add(jCheckBox6);
        jCheckBox6.setBounds(110, 20, 20, 21);
        jPanel3.add(jCheckBox7);
        jCheckBox7.setBounds(90, 20, 20, 21);
        jPanel3.add(jCheckBox8);
        jCheckBox8.setBounds(150, 20, 20, 21);
        jPanel3.add(jCheckBox9);
        jCheckBox9.setBounds(130, 20, 20, 21);
        jPanel3.add(jCheckBox10);
        jCheckBox10.setBounds(70, 40, 20, 21);
        jPanel3.add(jCheckBox11);
        jCheckBox11.setBounds(50, 40, 20, 21);
        jPanel3.add(jCheckBox12);
        jCheckBox12.setBounds(110, 40, 20, 21);
        jPanel3.add(jCheckBox13);
        jCheckBox13.setBounds(90, 40, 20, 21);
        jPanel3.add(jCheckBox14);
        jCheckBox14.setBounds(150, 40, 20, 21);
        jPanel3.add(jCheckBox15);
        jCheckBox15.setBounds(130, 40, 20, 21);
        jPanel3.add(jCheckBox16);
        jCheckBox16.setBounds(70, 60, 20, 21);
        jPanel3.add(jCheckBox17);
        jCheckBox17.setBounds(50, 60, 20, 21);
        jPanel3.add(jCheckBox18);
        jCheckBox18.setBounds(110, 60, 20, 21);
        jPanel3.add(jCheckBox19);
        jCheckBox19.setBounds(90, 60, 20, 21);
        jPanel3.add(jCheckBox20);
        jCheckBox20.setBounds(150, 60, 20, 21);
        jPanel3.add(jCheckBox21);
        jCheckBox21.setBounds(130, 60, 20, 21);
        jPanel3.add(jCheckBox22);
        jCheckBox22.setBounds(70, 80, 20, 21);
        jPanel3.add(jCheckBox23);
        jCheckBox23.setBounds(50, 80, 20, 21);
        jPanel3.add(jCheckBox24);
        jCheckBox24.setBounds(110, 80, 20, 21);
        jPanel3.add(jCheckBox25);
        jCheckBox25.setBounds(90, 80, 20, 21);
        jPanel3.add(jCheckBox26);
        jCheckBox26.setBounds(150, 80, 20, 21);
        jPanel3.add(jCheckBox27);
        jCheckBox27.setBounds(130, 80, 20, 21);

        jLabel57.setText("D i s p o n i b i l i t e s");
        jLabel57.setEnabled(false);

        jLabel77.setText("    2");

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/aleatoire.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel66))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addGap(12, 12, 12)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel68)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addGap(45, 45, 45)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addGap(14, 14, 14)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel31Layout.createSequentialGroup()
                                    .addComponent(jLabel71)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel74)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel31Layout.createSequentialGroup()
                                    .addComponent(jLabel73)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel72)
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel57))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(99, 99, 99))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel66)
                .addGap(14, 14, 14)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton20, 0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBounds(10, 10, 490, 210);
        jDesktopPane5.add(jPanel31, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel25.setBackground(new java.awt.Color(214, 217, 223));
        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel43.setText("L o g");
        jLabel43.setEnabled(false);

        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setRows(3);
        jTextArea2.setEnabled(false);
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(733, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel43)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel25.setBounds(10, 390, 770, 130);
        jDesktopPane5.add(jPanel25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea41.setColumns(20);
        jTextArea41.setRows(5);
        jScrollPane7.setViewportView(jTextArea41);

        jScrollPane7.setBounds(510, 120, 270, 260);
        jDesktopPane5.add(jScrollPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel20.setBackground(new java.awt.Color(214, 217, 223));
        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel20.setLayout(null);

        jLabel23.setText("user :");
        jPanel20.add(jLabel23);
        jLabel23.setBounds(20, 30, 30, 14);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/Start.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton26);
        jButton26.setBounds(150, 60, 40, 20);

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enseignant", "Etudiant", "Groupe", "Cours", "Salle", "Creation Planning" }));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox16ActionPerformed(evt);
            }
        });
        jPanel20.add(jComboBox16);
        jComboBox16.setBounds(20, 60, 120, 20);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel20.add(jComboBox2);
        jComboBox2.setBounds(50, 30, 140, 20);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/visualiser.png"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton25);
        jButton25.setBounds(200, 30, 40, 20);

        jLabel25.setText("C o n t r o l   P a n e l");
        jLabel25.setEnabled(false);
        jPanel20.add(jLabel25);
        jLabel25.setBounds(12, 2, 100, 14);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/Flg - Copie.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton27);
        jButton27.setBounds(200, 60, 40, 20);

        jPanel20.setBounds(510, 10, 270, 100);
        jDesktopPane5.add(jPanel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane7.addTab("Teacher Manager", jDesktopPane5);

        jDesktopPane6.setBackground(new java.awt.Color(229, 226, 230));
        jDesktopPane6.setEnabled(false);

        jPanel32.setBackground(new java.awt.Color(214, 217, 223));
        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setText("S t u d e n t ' s    L i s t    V i e w");
        jLabel59.setEnabled(false);
        jPanel32.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 2, -1, -1));

        jList6.setBackground(new java.awt.Color(-986896,true));
        jList6.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Chakib DOUADI", "Rafik BOUKELLA", "Achraf LANSARI", "Gym GARDEN", "Anas BELHADJ" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane15.setViewportView(jList6);

        jPanel32.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, 170, 121));

        jList7.setBackground(new java.awt.Color(-986896,true));
        jList7.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Programmation Fonctionnelle", "Analyse Numerique", "Logique", "Architecture des Ordinateurs", "Reseaux de neurones", "Methodologie de recherche" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane16.setViewportView(jList7);

        jPanel32.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 280, 121));

        jLabel17.setText("Etudiant");
        jPanel32.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel18.setText("Cours");
        jPanel32.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jButton13.setText("Assigner");
        jPanel32.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 75, -1));

        jButton14.setText("Retirer");
        jPanel32.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 75, -1));

        jButton17.setText("Editer");
        jPanel32.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 75, -1));

        jPanel32.setBounds(300, 10, 480, 190);
        jDesktopPane6.add(jPanel32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel33.setBackground(new java.awt.Color(214, 217, 223));
        jPanel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel33.setLayout(null);

        jLabel65.setText("Subject Manager");
        jLabel65.setEnabled(false);
        jPanel33.add(jLabel65);
        jLabel65.setBounds(10, 0, 90, 14);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/ajout_dossier - Copie.png"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel33.add(jButton23);
        jButton23.setBounds(270, 140, 40, 25);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/Flg - Copie.png"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel33.add(jButton24);
        jButton24.setBounds(320, 140, 45, 25);

        jLabel110.setText("Intitule :");
        jPanel33.add(jLabel110);
        jLabel110.setBounds(10, 40, 41, 20);
        jPanel33.add(jTextField23);
        jTextField23.setBounds(70, 40, 300, 20);

        jLabel111.setText("Heure / semaine :");
        jPanel33.add(jLabel111);
        jLabel111.setBounds(10, 70, 85, 20);

        jLabel112.setText("ECTS :");
        jPanel33.add(jLabel112);
        jLabel112.setBounds(10, 100, 32, 20);
        jPanel33.add(jTextField25);
        jTextField25.setBounds(110, 70, 60, 20);
        jPanel33.add(jTextField26);
        jTextField26.setBounds(50, 100, 30, 20);

        jLabel113.setText("Semestre :");
        jPanel33.add(jLabel113);
        jLabel113.setBounds(200, 70, 52, 20);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Oui", "Non" }));
        jPanel33.add(jComboBox11);
        jComboBox11.setBounds(310, 100, 60, 20);

        jLabel114.setText("Cours Obligatoire :");
        jPanel33.add(jLabel114);
        jLabel114.setBounds(200, 100, 90, 20);

        jTextField24.setText("12");
        jPanel33.add(jTextField24);
        jTextField24.setBounds(140, 100, 30, 20);

        jLabel115.setText("H / Sem");
        jPanel33.add(jLabel115);
        jLabel115.setBounds(90, 100, 40, 20);

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel33.add(jComboBox12);
        jComboBox12.setBounds(310, 70, 60, 20);

        jPanel33.setBounds(390, 210, 390, 180);
        jDesktopPane6.add(jPanel33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel34.setBackground(new java.awt.Color(214, 217, 223));
        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel78.setText("P e r s o n a l  d a t a");
        jLabel78.setEnabled(false);

        jLabel79.setText("Prénom :");

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/ajout_dossier - Copie.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/Flg - Copie.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel80.setText("Date de naissance :");

        jLabel81.setText("Adresse :");

        jLabel84.setText("Semestre : ");

        jLabel85.setText("INE : ");

        jLabel86.setText("Nom :");

        jTextField11.setForeground(new java.awt.Color(-986896,true));
        jTextField11.setText("                 JJ/MM/AAAA");
        jTextField11.setToolTipText("");

        jTextField12.setForeground(new java.awt.Color(-986896,true));
        jTextField12.setText("    CP");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel87.setText("Groupe : ");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel78))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel86)
                        .addGap(12, 12, 12)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel79)
                        .addGap(7, 7, 7)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel80)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addGap(14, 14, 14)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton16))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel85)))
                .addGap(23, 23, 23))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jLabel78)
                .addGap(14, 14, 14)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16)
                    .addComponent(jButton15))
                .addGap(18, 18, 18))
        );

        jPanel34.setBounds(10, 10, 280, 190);
        jDesktopPane6.add(jPanel34, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel26.setBackground(new java.awt.Color(214, 217, 223));
        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel52.setText("L o g");
        jLabel52.setEnabled(false);

        jTextArea8.setColumns(20);
        jTextArea8.setEditable(false);
        jTextArea8.setRows(3);
        jTextArea8.setEnabled(false);
        jScrollPane21.setViewportView(jTextArea8);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addContainerGap(733, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel26.setBounds(10, 400, 770, 120);
        jDesktopPane6.add(jPanel26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel35.setBackground(new java.awt.Color(214, 217, 223));
        jPanel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel35.setLayout(null);

        jLabel67.setText("Room Manager");
        jLabel67.setEnabled(false);
        jPanel35.add(jLabel67);
        jLabel67.setBounds(10, 0, 90, 14);
        jPanel35.add(jTextField15);
        jTextField15.setBounds(80, 30, 70, 20);

        jLabel88.setText("Numero :");
        jPanel35.add(jLabel88);
        jLabel88.setBounds(20, 30, 44, 20);

        jLabel89.setText("Type :");
        jPanel35.add(jLabel89);
        jLabel89.setBounds(20, 60, 40, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amphi", "TP" }));
        jPanel35.add(jComboBox5);
        jComboBox5.setBounds(60, 60, 90, 20);

        jLabel90.setText("      30");
        jPanel35.add(jLabel90);
        jLabel90.setBounds(90, 90, 50, 20);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/ajout_dossier - Copie.png"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel35.add(jButton21);
        jButton21.setBounds(250, 140, 40, 25);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flag/Flg - Copie.png"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel35.add(jButton22);
        jButton22.setBounds(300, 140, 40, 25);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jLabel105.setText("Lun  Mar Mer Jeu Ven Sam");
        jPanel5.add(jLabel105);
        jLabel105.setBounds(50, 10, 130, 14);

        jLabel106.setText("09h-12h");
        jPanel5.add(jLabel106);
        jLabel106.setBounds(10, 20, 40, 20);

        jLabel107.setText("18h-21h");
        jPanel5.add(jLabel107);
        jLabel107.setBounds(10, 80, 40, 20);

        jLabel108.setText("12h-15h");
        jPanel5.add(jLabel108);
        jLabel108.setBounds(10, 40, 40, 20);

        jLabel109.setText("15h-18h");
        jPanel5.add(jLabel109);
        jLabel109.setBounds(10, 60, 40, 20);
        jPanel5.add(jCheckBox52);
        jCheckBox52.setBounds(70, 20, 20, 21);

        jCheckBox53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox53ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox53);
        jCheckBox53.setBounds(50, 20, 20, 21);
        jPanel5.add(jCheckBox54);
        jCheckBox54.setBounds(110, 20, 20, 21);
        jPanel5.add(jCheckBox55);
        jCheckBox55.setBounds(90, 20, 20, 21);
        jPanel5.add(jCheckBox56);
        jCheckBox56.setBounds(150, 20, 20, 21);
        jPanel5.add(jCheckBox57);
        jCheckBox57.setBounds(130, 20, 20, 21);
        jPanel5.add(jCheckBox58);
        jCheckBox58.setBounds(70, 40, 20, 21);
        jPanel5.add(jCheckBox59);
        jCheckBox59.setBounds(50, 40, 20, 21);
        jPanel5.add(jCheckBox60);
        jCheckBox60.setBounds(110, 40, 20, 21);
        jPanel5.add(jCheckBox61);
        jCheckBox61.setBounds(90, 40, 20, 21);
        jPanel5.add(jCheckBox62);
        jCheckBox62.setBounds(150, 40, 20, 21);
        jPanel5.add(jCheckBox63);
        jCheckBox63.setBounds(130, 40, 20, 21);
        jPanel5.add(jCheckBox64);
        jCheckBox64.setBounds(70, 60, 20, 21);
        jPanel5.add(jCheckBox65);
        jCheckBox65.setBounds(50, 60, 20, 21);
        jPanel5.add(jCheckBox66);
        jCheckBox66.setBounds(110, 60, 20, 21);
        jPanel5.add(jCheckBox67);
        jCheckBox67.setBounds(90, 60, 20, 21);
        jPanel5.add(jCheckBox68);
        jCheckBox68.setBounds(150, 60, 20, 21);
        jPanel5.add(jCheckBox69);
        jCheckBox69.setBounds(130, 60, 20, 21);
        jPanel5.add(jCheckBox70);
        jCheckBox70.setBounds(70, 80, 20, 21);
        jPanel5.add(jCheckBox71);
        jCheckBox71.setBounds(50, 80, 20, 21);
        jPanel5.add(jCheckBox72);
        jCheckBox72.setBounds(110, 80, 20, 21);
        jPanel5.add(jCheckBox73);
        jCheckBox73.setBounds(90, 80, 20, 21);
        jPanel5.add(jCheckBox74);
        jCheckBox74.setBounds(150, 80, 20, 21);
        jPanel5.add(jCheckBox75);
        jCheckBox75.setBounds(130, 80, 20, 21);

        jPanel35.add(jPanel5);
        jPanel5.setBounds(160, 20, 190, 110);

        jLabel91.setText("Capacite : ");
        jPanel35.add(jLabel91);
        jLabel91.setBounds(20, 90, 60, 20);

        jPanel35.setBounds(10, 210, 370, 180);
        jDesktopPane6.add(jPanel35, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane7.addTab("Student - Room & Subject Manager", jDesktopPane6);

        jPanel1.setBackground(new java.awt.Color(229, 226, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setText("Help");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setText("Log");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(153, 255, 153));
        jProgressBar1.setValue(45);

        jLabel64.setText("Systeme de Gestion des EDT - Master Informatique & Sciences Humaines");
        jLabel64.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel64))
            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jFormattedTextField1.setText("jFormattedTextField1");

        jMenuBar1.setForeground(javax.swing.UIManager.getDefaults().getColor("nb.errorForeground"));

        jMenu1.setText("Program");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("LogWindow");
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Exit");
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("UML");

        jMenuItem3.setText("Class Diagram");
        jMenu3.add(jMenuItem3);

        jMenuItem2.setText("Use Case Diagram");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("A propos");

        jMenuItem5.setText("SystemInfo");
        jMenu4.add(jMenuItem5);

        jMenuItem9.setText("About");
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane7.getAccessibleContext().setAccessibleDescription("dadada");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     javax.swing.JOptionPane.showMessageDialog(null, "Si vous etes toujours perdu, Consultez l'admin.", "Help", WIDTH);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    javax.swing.JOptionPane.showConfirmDialog(null, " Are you sure to do it ?");
    System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

}//GEN-LAST:event_jButton7ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int [] T = jTable3.getSelectedRows();
        if(T.length==1){
            jLabel34.setText(" ");
            jLabel45.setText(" ");
            jLabel46.setText(" ");
        } else {
            jLabel34.setText("-");
            jLabel45.setText("-");
            jLabel46.setText("-");
        }
}//GEN-LAST:event_jTable3MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        Referentiel.setListAllCours();
        effacer_cours();
        SimpleDateFormat formater = null;
        Date aujourdhui = new Date();
        formater = new SimpleDateFormat("hh:mm:ss a");
        logWrite(formater.format(aujourdhui)+"  -->  Subject added.\n" );
        buttonGroup2.add(jCheckBox53);
        buttonGroup2.add(jCheckBox52);
        buttonGroup2.add(jCheckBox55);
        Learn.jTextArea41.setText("\n"+buttonGroup2.getSelection().toString()+"\n");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        effacer_cours();
        SimpleDateFormat formater = null;
        Date aujourdhui = new Date();
        formater = new SimpleDateFormat("hh:mm:ss a");
        logWrite(formater.format(aujourdhui)+"  -->  Data deleted.\n" );
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jCheckBox53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox53ActionPerformed
        
    }//GEN-LAST:event_jCheckBox53ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        Referentiel.setListAllSalle();
        effacer_salle();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        effacer_salle();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTable3AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jTable3AncestorResized

    }//GEN-LAST:event_jTable3AncestorResized

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Referentiel.setListAllEtudiant();
        effacer_etudiant();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        effacer_etudiant();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jTable3.setVisible(true);
        /*
        String dsName = jComboBox2.getSelectedItem().toString();
        Object [] Ligne = new Object[8];
        String [] titre= {"Heure","Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi"};
        DefaultTableModel model = new DefaultTableModel( null , titre);
        for(int i=0;i<4;i++)model.addRow(Ligne);
        jTable3.setModel(model); */
        JOptionPane.showMessageDialog(null,"Timetable Generated Successfully");
        for(int i=0;i<4;i++)
            for(int j=1;j<6;j++){
               if( PlanningHebdo.eDT.get( i*5 + j-1).getCodeCours() != null )
                    jTable3.setValueAt(PlanningHebdo.eDT.get( i*5 + j-1).getCodeCours() +"-"+PlanningHebdo.eDT.get( i*5 + j-1).getCodeEns()+"-"+PlanningHebdo.eDT.get( i*5 + j-1).groupe.nomGroupe, i, j);
            }
        SimpleDateFormat formater = null;
        Date aujourdhui = new Date();
        formater = new SimpleDateFormat("hh:mm:ss a");
        logWrite(formater.format(aujourdhui)+"  -->  Load Button clicked.\n"+formater.format(aujourdhui)+"  -->  End of loading Dataset.\n" );
        jTabbedPane7.setSelectedIndex(0);       
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        SimpleDateFormat formater = null;
        Date aujourdhui = new Date();
        formater = new SimpleDateFormat("hh:mm:ss a");
        logWrite(formater.format(aujourdhui)+"  -->  InitComponents... \n" );
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox16ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
     jTextArea41.setVisible(true);
     int i = jComboBox16.getSelectedIndex();
     switch(i){
         case 0: { afficherMenuEnseignant(); break; }
         case 1: { afficherMenuEtudiant(); break; }
         case 2: { afficherMenuGroupe(); break; }
         case 3: { afficherMenuCours(); break; }
         case 4: { afficherMenuSalle(); break; }
         case 5: { PlanningHebdo p = new PlanningHebdo();
                    p.setPlanningHebdo();
                    p.afficherPlanning(); break; }
         default:;
     }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       vari =0;
        effacer_enseignant();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Referentiel r = new Referentiel();
        
if(vari==0){ Referentiel.setListEnseignant();
        DefaultListModel model = new DefaultListModel();
        for(int i = 0; i<Referentiel.listEnseignant.size(); i++){
                  model.addElement(""+Referentiel.listEnseignant.get(i).getNom()+" "+Referentiel.listEnseignant.get(i).getPrenom()+"");
        }
        jList1.setModel(model);
}
else{
  for(int j=0; j< Referentiel.listEnseignant.size() ;j++){
    if( Referentiel.listEnseignant.get(j).nom.equals( Learn.jTextField7.getText() ) ) {
        Referentiel.listEnseignant.get(j).nom = Learn.jTextField7.getText();
        Referentiel.listEnseignant.get(j).prenom = Learn.jTextField3.getText();
        Referentiel.listEnseignant.get(j).dateNaissance = Learn.jTextField5.getText();
        Referentiel.listEnseignant.get(j).adresse = Learn.jTextField4.getText();
        Referentiel.listEnseignant.get(j).ville = Learn.jTextField6.getText();
        Referentiel.listEnseignant.get(j).id = Learn.jTextField8.getText();
   switch(Learn.jComboBox1.getSelectedIndex()){
       case 0: { Referentiel.listEnseignant.get(j).titre ="Maitre_Conference";  break; }
       case 1: { Referentiel.listEnseignant.get(j).titre ="Professeur"; break; }
       case 2: { Referentiel.listEnseignant.get(j).titre ="Doctorant"; break; }
   }
   //r.listEnseignant.get(j).nbrCoursSemaine = Learn.jComboBox3.getSelectedIndex()+1;
   Referentiel.listEnseignant.get(j).charges = (int)(new Double(Learn.jLabel77.getText())).doubleValue();

   Referentiel.listEnseignant.get(j).disponibilite[0][0] = Learn.jCheckBox5.isSelected();    Referentiel.listEnseignant.get(j).disponibilite[0][1] = Learn.jCheckBox4.isSelected();   Referentiel.listEnseignant.get(j).disponibilite[0][2] = Learn.jCheckBox7.isSelected();    Referentiel.listEnseignant.get(j).disponibilite[0][3] = Learn.jCheckBox6.isSelected();   Referentiel.listEnseignant.get(j).disponibilite[0][4] = Learn.jCheckBox9.isSelected();   Referentiel.listEnseignant.get(j).disponibilite[0][5] = Learn.jCheckBox8.isSelected();
   Referentiel.listEnseignant.get(j).disponibilite[1][0] = Learn.jCheckBox11.isSelected();   Referentiel.listEnseignant.get(j).disponibilite[1][1] = Learn.jCheckBox10.isSelected();  Referentiel.listEnseignant.get(j).disponibilite[1][2] = Learn.jCheckBox13.isSelected();   Referentiel.listEnseignant.get(j).disponibilite[1][3] = Learn.jCheckBox12.isSelected();  Referentiel.listEnseignant.get(j).disponibilite[1][4] = Learn.jCheckBox15.isSelected();  Referentiel.listEnseignant.get(j).disponibilite[1][5] = Learn.jCheckBox14.isSelected();
   Referentiel.listEnseignant.get(j).disponibilite[2][0] = Learn.jCheckBox17.isSelected();   Referentiel.listEnseignant.get(j).disponibilite[2][1] = Learn.jCheckBox16.isSelected();  Referentiel.listEnseignant.get(j).disponibilite[2][2] = Learn.jCheckBox19.isSelected();   Referentiel.listEnseignant.get(j).disponibilite[2][3] = Learn.jCheckBox18.isSelected();  Referentiel.listEnseignant.get(j).disponibilite[2][4] = Learn.jCheckBox21.isSelected();  Referentiel.listEnseignant.get(j).disponibilite[2][5] = Learn.jCheckBox20.isSelected();
   Referentiel.listEnseignant.get(j).disponibilite[3][0] = Learn.jCheckBox23.isSelected();   Referentiel.listEnseignant.get(j).disponibilite[3][1] = Learn.jCheckBox22.isSelected();  Referentiel.listEnseignant.get(j).disponibilite[3][2] = Learn.jCheckBox25.isSelected();   Referentiel.listEnseignant.get(j).disponibilite[3][3] = Learn.jCheckBox24.isSelected();  Referentiel.listEnseignant.get(j).disponibilite[3][4] = Learn.jCheckBox27.isSelected();  Referentiel.listEnseignant.get(j).disponibilite[3][5] = Learn.jCheckBox26.isSelected();

           }
        }

        }
        vari =0;
        effacer_enseignant();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       if( Learn.jList1.getSelectedIndex()==-1 || Learn.jList3.getSelectedIndex()==-1 || Learn.jComboBox8.getSelectedIndex()==-1 ){ logWrite("Affectation annulé : veuillez choisir un enseingant, un cours et un groupe !");
            }
            else {
                Cours c = Referentiel.editEnseignant();
                if(c==null)logWrite("Affectation ignore");
                    else logWrite("Affectation du cours " + c.libelle + " pour " + jList1.getSelectedValue().toString() + " - " + jComboBox8.getSelectedItem().toString());
            }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        


        
       /* DefaultListModel model = new DefaultListModel();
        for(int i = 0; i< r.listEnseignant.get(k).getListCours().size(); i++){
                  model.addElement(""+r.listEnseignant.get(k).getListCours().get(i).libelle+"");
        }
        jList12.setModel(model);*/
    }//GEN-LAST:event_jList1MouseClicked

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
       int i= jComboBox1.getSelectedIndex();
       jComboBox3.removeAllItems();
       if(i==0){ jLabel77.setText("    2"); jComboBox3.addItem("1"); jComboBox3.addItem("2"); }
         else if(i==1) { jLabel77.setText("    4"); jComboBox3.addItem("1"); jComboBox3.addItem("2"); jComboBox3.addItem("3"); jComboBox3.addItem("4");  }
           else { jLabel77.setText("    6");  jComboBox3.addItem("1"); jComboBox3.addItem("2"); jComboBox3.addItem("3"); jComboBox3.addItem("4"); jComboBox3.addItem("5"); jComboBox3.addItem("6"); }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
           vari = 1;
        Referentiel r = new Referentiel();
        int k = jList1.getSelectedIndex();
        jTextField7.setText(r.listEnseignant.get(k).nom);
        jTextField3.setText(r.listEnseignant.get(k).prenom);

   Learn.jCheckBox5.setSelected( r.listEnseignant.get(k).disponibilite[0][0] );     Learn.jCheckBox4.setSelected(   r.listEnseignant.get(k).disponibilite[0][1] ); Learn.jCheckBox7.setSelected(  r.listEnseignant.get(k).disponibilite[0][2]);   Learn.jCheckBox6.setSelected( r.listEnseignant.get(k).disponibilite[0][3]    ); Learn.jCheckBox9.setSelected(   r.listEnseignant.get(k).disponibilite[0][4]   );    Learn.jCheckBox8.setSelected(r.listEnseignant.get(k).disponibilite[0][5]  );
   Learn.jCheckBox11.setSelected(   r.listEnseignant.get(k).disponibilite[1][0]);    Learn.jCheckBox10.setSelected( r.listEnseignant.get(k).disponibilite[1][1]   );   Learn.jCheckBox13.setSelected(r.listEnseignant.get(k).disponibilite[1][2]    );   Learn.jCheckBox12.setSelected(r.listEnseignant.get(k).disponibilite[1][3]    );   Learn.jCheckBox15.setSelected(r.listEnseignant.get(k).disponibilite[1][4]    );   Learn.jCheckBox14.setSelected( r.listEnseignant.get(k).disponibilite[1][5]  );
   Learn.jCheckBox17.setSelected(  r.listEnseignant.get(k).disponibilite[2][0]  );    Learn.jCheckBox16.setSelected( r.listEnseignant.get(k).disponibilite[2][1]    );   Learn.jCheckBox19.setSelected(r.listEnseignant.get(k).disponibilite[2][2]     );  Learn.jCheckBox18.setSelected( r.listEnseignant.get(k).disponibilite[2][3]     );   Learn.jCheckBox21.setSelected( r.listEnseignant.get(k).disponibilite[2][4]   );   Learn.jCheckBox20.setSelected( r.listEnseignant.get(k).disponibilite[2][5]  );
   Learn.jCheckBox23.setSelected(r.listEnseignant.get(k).disponibilite[3][0]    );   Learn.jCheckBox22.setSelected(r.listEnseignant.get(k).disponibilite[3][1]    );   Learn.jCheckBox25.setSelected(r.listEnseignant.get(k).disponibilite[3][2]     );   Learn.jCheckBox24.setSelected(  r.listEnseignant.get(k).disponibilite[3][3]  );   Learn.jCheckBox27.setSelected(r.listEnseignant.get(k).disponibilite[3][4]     );   Learn.jCheckBox26.setSelected(r.listEnseignant.get(k).disponibilite[3][5]   );



        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        vari = 0;
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
       vari = 0;
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
     if( PlanningHebdo.eDT != null ) {
        PlanningHebdo.eDT = new ArrayList<Enseignement>();
        Referentiel.listAllSalle = new ArrayList<Salle>();
        Referentiel.listEnseignant =new ArrayList<Enseignant>();
        Referentiel.listAllCours = new ArrayList<Cours>();
        Referentiel.listAllGroupe = new ArrayList<Groupe>();
        Referentiel.listAllEtudiant = new ArrayList<Etudiant>();
        Referentiel.initReferentiel();
        Learn.jTextArea41.setText("");
     }
       else javax.swing.JOptionPane.showMessageDialog(null, " What are you expecting :/ ?","Alert !",1);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
     if( PlanningHebdo.eDT != null ) {
        PlanningHebdo.eDT = new ArrayList<Enseignement>();
        Referentiel.listAllSalle = new ArrayList<Salle>();
        Referentiel.listEnseignant =new ArrayList<Enseignant>();
        Referentiel.listAllCours = new ArrayList<Cours>();
        Referentiel.listAllGroupe = new ArrayList<Groupe>();
        Referentiel.listAllEtudiant = new ArrayList<Etudiant>();
        Referentiel.initReferentiel();
        Learn.jTextArea41.setText("");
     }
       else javax.swing.JOptionPane.showMessageDialog(null, " What are you expecting :/ ?","Alert !",1);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

   if(lm%4==0){
   Learn.jCheckBox5.setSelected(false);    Learn.jCheckBox4.setSelected(false);   Learn.jCheckBox7.setSelected(false);
   Learn.jCheckBox6.setSelected(true);     Learn.jCheckBox9.setSelected(false);
   Learn.jCheckBox10.setSelected(false);   Learn.jCheckBox11.setSelected(false);   Learn.jCheckBox12.setSelected(false);
   Learn.jCheckBox13.setSelected(true);    Learn.jCheckBox15.setSelected(false);
   Learn.jCheckBox16.setSelected(false);   Learn.jCheckBox17.setSelected(false);   Learn.jCheckBox18.setSelected(false);
   Learn.jCheckBox19.setSelected(false);   Learn.jCheckBox21.setSelected(false);
   Learn.jCheckBox22.setSelected(false);   Learn.jCheckBox23.setSelected(false);   Learn.jCheckBox24.setSelected(true);
   Learn.jCheckBox25.setSelected(false);   Learn.jCheckBox27.setSelected(false);
   }
 else if(lm%4==1){
   Learn.jCheckBox5.setSelected(true);   Learn.jCheckBox4.setSelected(false);   Learn.jCheckBox7.setSelected(true);
   Learn.jCheckBox6.setSelected(false);   Learn.jCheckBox9.setSelected(false);
   Learn.jCheckBox10.setSelected(true);   Learn.jCheckBox11.setSelected(false);   Learn.jCheckBox12.setSelected(false);
   Learn.jCheckBox13.setSelected(false);   Learn.jCheckBox15.setSelected(true);
   Learn.jCheckBox16.setSelected(false);   Learn.jCheckBox17.setSelected(false);   Learn.jCheckBox18.setSelected(false);
   Learn.jCheckBox19.setSelected(false);   Learn.jCheckBox21.setSelected(false);
   Learn.jCheckBox22.setSelected(false);   Learn.jCheckBox23.setSelected(false);   Learn.jCheckBox24.setSelected(false);
   Learn.jCheckBox25.setSelected(true);    Learn.jCheckBox27.setSelected(false);}

 else if(lm%4==2){
   Learn.jCheckBox5.setSelected(false);   Learn.jCheckBox4.setSelected(false);   Learn.jCheckBox7.setSelected(true);
   Learn.jCheckBox6.setSelected(false);   Learn.jCheckBox9.setSelected(false);
   Learn.jCheckBox10.setSelected(true);   Learn.jCheckBox11.setSelected(true);   Learn.jCheckBox12.setSelected(false);
   Learn.jCheckBox13.setSelected(false);  Learn.jCheckBox15.setSelected(false);
   Learn.jCheckBox16.setSelected(false);   Learn.jCheckBox17.setSelected(false);   Learn.jCheckBox18.setSelected(false);
   Learn.jCheckBox19.setSelected(false);   Learn.jCheckBox21.setSelected(false);
   Learn.jCheckBox22.setSelected(false);   Learn.jCheckBox23.setSelected(true);   Learn.jCheckBox24.setSelected(false);
   Learn.jCheckBox25.setSelected(false);      Learn.jCheckBox27.setSelected(true);}

 else if(lm%4==3){
   Learn.jCheckBox5.setSelected(false);   Learn.jCheckBox4.setSelected(false);   Learn.jCheckBox7.setSelected(false);
   Learn.jCheckBox6.setSelected(false);   Learn.jCheckBox9.setSelected(false);
   Learn.jCheckBox10.setSelected(false);   Learn.jCheckBox11.setSelected(true);   Learn.jCheckBox12.setSelected(true);
   Learn.jCheckBox13.setSelected(false);   Learn.jCheckBox15.setSelected(false);
   Learn.jCheckBox16.setSelected(true);   Learn.jCheckBox17.setSelected(false);   Learn.jCheckBox18.setSelected(false);
   Learn.jCheckBox19.setSelected(false);      Learn.jCheckBox21.setSelected(false);
   Learn.jCheckBox22.setSelected(false);   Learn.jCheckBox23.setSelected(false);   Learn.jCheckBox24.setSelected(true);
   Learn.jCheckBox25.setSelected(false);   Learn.jCheckBox27.setSelected(false);}
   lm++;
    }//GEN-LAST:event_jButton20ActionPerformed

public void effacer_enseignant(){
   Learn.jTextField7.setText("");    Learn.jTextField3.setText("");    Learn.jTextField5.setText("");    Learn.jTextField4.setText("");
   Learn.jTextField6.setText("");    Learn.jTextField8.setText("");    Learn.jComboBox1.setSelectedIndex(0);   Learn.jComboBox3.setSelectedIndex(0);
   init_dispo_ens(false); jLabel77.setText("    2"); jComboBox3.addItem("1"); jComboBox3.addItem("2"); 
}

 public void effacer_etudiant(){
   Learn.jTextField13.setText("");     Learn.jTextField9.setText("");      Learn.jTextField11.setText("");     Learn.jTextField10.setText("");
   Learn.jTextField12.setText("");     Learn.jTextField14.setText("");   Learn.jComboBox6.setSelectedIndex(0);    Learn.jComboBox7.setSelectedIndex(0);
}

public void effacer_salle(){
   Learn.jTextField15.setText("");
   Learn.jComboBox5.setSelectedIndex(0);
   init_dispo_salle(false);
}

public void effacer_cours(){
   Learn.jTextField23.setText("");   Learn.jTextField24.setText("");
   Learn.jTextField25.setText("");   Learn.jTextField26.setText("");
   Learn.jComboBox11.setSelectedIndex(0);
}

public static void afficherMenuEnseignant() {
    Learn.jTextArea41.setText("Liste des enseignants :");
    Referentiel.afficherListEnseignant();
}

public static void afficherMenuCours() {
	//Referentiel.setListAllCours();
        Learn.jTextArea41.setText("Liste des cours :");
        Referentiel.afficherListAllCours();
}

public static void afficherMenuGroupe() {
	Learn.jTextArea41.setText("Liste des groupes :");
        Referentiel.afficherListAllGroupe();
}

public static void afficherMenuSalle() {
        Learn.jTextArea41.setText("Liste des Salles :");
        Referentiel.afficherListAllSalle();

}

public static void afficherMenuEtudiant() {
	Referentiel.afficherListAllEtudiant();  
}

public final void logWrite(String a){
    jTextArea8.append(a+"\n" );
    jTextArea2.append(a+"\n" );
}

public void init_dispo_salle(boolean valeur){
   Learn.jCheckBox53.setSelected(valeur);   Learn.jCheckBox52.setSelected(valeur);   Learn.jCheckBox55.setSelected(valeur);
   Learn.jCheckBox54.setSelected(valeur);   Learn.jCheckBox57.setSelected(valeur);   Learn.jCheckBox56.setSelected(valeur);
   Learn.jCheckBox59.setSelected(valeur);   Learn.jCheckBox58.setSelected(valeur);   Learn.jCheckBox61.setSelected(valeur);
   Learn.jCheckBox60.setSelected(valeur);   Learn.jCheckBox63.setSelected(valeur);   Learn.jCheckBox62.setSelected(valeur);
   Learn.jCheckBox65.setSelected(valeur);   Learn.jCheckBox64.setSelected(valeur);   Learn.jCheckBox67.setSelected(valeur);
   Learn.jCheckBox66.setSelected(valeur);   Learn.jCheckBox69.setSelected(valeur);   Learn.jCheckBox68.setSelected(valeur);
   Learn.jCheckBox71.setSelected(valeur);   Learn.jCheckBox70.setSelected(valeur);   Learn.jCheckBox73.setSelected(valeur);
   Learn.jCheckBox72.setSelected(valeur);   Learn.jCheckBox75.setSelected(valeur);   Learn.jCheckBox74.setSelected(valeur);
}

public void init_dispo_ens(boolean valeur){
   Learn.jCheckBox5.setSelected(valeur);   Learn.jCheckBox4.setSelected(valeur);   Learn.jCheckBox7.setSelected(valeur);
   Learn.jCheckBox6.setSelected(valeur);   Learn.jCheckBox8.setSelected(valeur);   Learn.jCheckBox9.setSelected(valeur);
   Learn.jCheckBox10.setSelected(valeur);   Learn.jCheckBox11.setSelected(valeur);   Learn.jCheckBox12.setSelected(valeur);
   Learn.jCheckBox13.setSelected(valeur);   Learn.jCheckBox14.setSelected(valeur);   Learn.jCheckBox15.setSelected(valeur);
   Learn.jCheckBox16.setSelected(valeur);   Learn.jCheckBox17.setSelected(valeur);   Learn.jCheckBox18.setSelected(valeur);
   Learn.jCheckBox19.setSelected(valeur);   Learn.jCheckBox20.setSelected(valeur);   Learn.jCheckBox21.setSelected(valeur);
   Learn.jCheckBox22.setSelected(valeur);   Learn.jCheckBox23.setSelected(valeur);   Learn.jCheckBox24.setSelected(valeur);
   Learn.jCheckBox25.setSelected(valeur);   Learn.jCheckBox26.setSelected(valeur);   Learn.jCheckBox27.setSelected(valeur);
}

public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Referentiel.initReferentiel();
                new Learn().setVisible(true);
             }
        });
    }

////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////Windows design

// <editor-fold defaultstate="collapsed" desc="Windows Design">
    {
        try {
            try {
                javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
               //javax.swing.UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Learn.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Learn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Learn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Learn.class.getName()).log(Level.SEVERE, null, ex);
        } 
		}// </editor-fold>

    private static File currentDirectory;
        
    // <editor-fold defaultstate="collapsed" desc="Variables Declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    public static javax.swing.JButton jButton13;
    public static javax.swing.JButton jButton14;
    public static javax.swing.JButton jButton15;
    public static javax.swing.JButton jButton16;
    public static javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    public static javax.swing.JButton jButton21;
    public static javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public static javax.swing.JCheckBox jCheckBox10;
    public static javax.swing.JCheckBox jCheckBox11;
    public static javax.swing.JCheckBox jCheckBox12;
    public static javax.swing.JCheckBox jCheckBox13;
    public static javax.swing.JCheckBox jCheckBox14;
    public static javax.swing.JCheckBox jCheckBox15;
    public static javax.swing.JCheckBox jCheckBox16;
    public static javax.swing.JCheckBox jCheckBox17;
    public static javax.swing.JCheckBox jCheckBox18;
    public static javax.swing.JCheckBox jCheckBox19;
    public static javax.swing.JCheckBox jCheckBox20;
    public static javax.swing.JCheckBox jCheckBox21;
    public static javax.swing.JCheckBox jCheckBox22;
    public static javax.swing.JCheckBox jCheckBox23;
    public static javax.swing.JCheckBox jCheckBox24;
    public static javax.swing.JCheckBox jCheckBox25;
    public static javax.swing.JCheckBox jCheckBox26;
    public static javax.swing.JCheckBox jCheckBox27;
    public static javax.swing.JCheckBox jCheckBox4;
    public static javax.swing.JCheckBox jCheckBox5;
    public static javax.swing.JCheckBox jCheckBox52;
    public static javax.swing.JCheckBox jCheckBox53;
    public static javax.swing.JCheckBox jCheckBox54;
    public static javax.swing.JCheckBox jCheckBox55;
    public static javax.swing.JCheckBox jCheckBox56;
    public static javax.swing.JCheckBox jCheckBox57;
    public static javax.swing.JCheckBox jCheckBox58;
    public static javax.swing.JCheckBox jCheckBox59;
    public static javax.swing.JCheckBox jCheckBox6;
    public static javax.swing.JCheckBox jCheckBox60;
    public static javax.swing.JCheckBox jCheckBox61;
    public static javax.swing.JCheckBox jCheckBox62;
    public static javax.swing.JCheckBox jCheckBox63;
    public static javax.swing.JCheckBox jCheckBox64;
    public static javax.swing.JCheckBox jCheckBox65;
    public static javax.swing.JCheckBox jCheckBox66;
    public static javax.swing.JCheckBox jCheckBox67;
    public static javax.swing.JCheckBox jCheckBox68;
    public static javax.swing.JCheckBox jCheckBox69;
    public static javax.swing.JCheckBox jCheckBox7;
    public static javax.swing.JCheckBox jCheckBox70;
    public static javax.swing.JCheckBox jCheckBox71;
    public static javax.swing.JCheckBox jCheckBox72;
    public static javax.swing.JCheckBox jCheckBox73;
    public static javax.swing.JCheckBox jCheckBox74;
    public static javax.swing.JCheckBox jCheckBox75;
    public static javax.swing.JCheckBox jCheckBox8;
    public static javax.swing.JCheckBox jCheckBox9;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    public static javax.swing.JComboBox jComboBox11;
    public static javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox2;
    public static javax.swing.JComboBox jComboBox3;
    public static javax.swing.JComboBox jComboBox5;
    public static javax.swing.JComboBox jComboBox6;
    public static javax.swing.JComboBox jComboBox7;
    public static javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    public static javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    public static javax.swing.JList jList1;
    public static javax.swing.JList jList3;
    private javax.swing.JList jList6;
    private javax.swing.JList jList7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    public static javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTextArea jTextArea41;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea8;
    public static javax.swing.JTextField jTextField10;
    public static javax.swing.JTextField jTextField11;
    public static javax.swing.JTextField jTextField12;
    public static javax.swing.JTextField jTextField13;
    public static javax.swing.JTextField jTextField14;
    public static javax.swing.JTextField jTextField15;
    public static javax.swing.JTextField jTextField23;
    public static javax.swing.JTextField jTextField24;
    public static javax.swing.JTextField jTextField25;
    public static javax.swing.JTextField jTextField26;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}