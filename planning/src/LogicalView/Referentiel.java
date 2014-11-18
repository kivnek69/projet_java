package LogicalView;

import java.util.ArrayList;

public class Referentiel {
    public static ArrayList<Salle>         listAllSalle = new ArrayList<Salle>();
    public static ArrayList<Enseignant>    listEnseignant = new ArrayList<Enseignant>();
    public static ArrayList<Cours>         listAllCours = new ArrayList<Cours>();
    public static ArrayList<Groupe>        listAllGroupe = new ArrayList<Groupe>();
    public static ArrayList<Etudiant>      listAllEtudiant = new ArrayList<Etudiant>();
    public static ArrayList<Jour>          listAllJour = new ArrayList<Jour>();

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////Salle

public static void initReferentiel() {
    //listAllCours.add(new Cours("Architecture des Ordinateurs",5,1,false)); listAllCours.add(new Cours("Logique",5,1,true)); listAllCours.add(new Cours("Programmation Fonctionnelle",5,1,true)); listAllCours.add(new Cours("Reseaux de neurones",5,1,false));  listAllCours.add(new Cours("Analyse Numerique",5,1,true)); listAllCours.add(new Cours("Methodologie de recherche",5,1,false));
    listAllCours.add(new Cours("A",5,1,false,"AdO")); listAllCours.add(new Cours("B",5,1,true,"Log")); listAllCours.add(new Cours("C",5,1,true,"PF")); listAllCours.add(new Cours("D",5,1,false,"RN"));  listAllCours.add(new Cours("E",5,1,true,"AN")); listAllCours.add(new Cours("F",5,1,false,"MR"));
    listAllGroupe.add(new Groupe("Groupe 1")); listAllGroupe.add(new Groupe("Groupe 2")); //listAllGroupe.add(new Groupe("Groupe 3")); listAllGroupe.add(new Groupe("Groupe 4")); listAllGroupe.add(new Groupe("Groupe 5"));
    listAllSalle.add(new Salle("Salle 1")); listAllSalle.add(new Salle("Salle 2"));
    listEnseignant.add(new Enseignant("ANNA", "PAPPA")); listEnseignant.add(new Enseignant("JORDAN","SUAREZ")); listEnseignant.add(new Enseignant("GILLES","BERNARD")); listEnseignant.add(new Enseignant("JACQUELINE", "SIGNORINI")); listEnseignant.add(new Enseignant("JEAN JACQUES","MARIAGE")); listEnseignant.add(new Enseignant("ARAB","ALI CHERIF"));
    listAllEtudiant.add(new Etudiant(52401,"ABELLAN","MELVI",1,1)); listAllEtudiant.add(new Etudiant(51856,"AFONSO","RACHEL",2,2)); listAllEtudiant.add(new Etudiant(51922,"AJDINOVIC","MERISA",3,2)); listAllEtudiant.add(new Etudiant(51773,"ALTOBELLI","JOHANNA",4,2)); listAllEtudiant.add(new Etudiant(52558,"ARNOLD","TIM",1,1)); listAllEtudiant.add(new Etudiant(51843,"ATTALON","DEBORA",4,2)); listAllEtudiant.add(new Etudiant(54047,"BADAOUI","HICHAM",3,1)); listAllEtudiant.add(new Etudiant(52389,"BANCEL","CAMILLE",4,2)); listAllEtudiant.add(new Etudiant(51862,"BARKET","MEHDI",5,2)); listAllEtudiant.add(new Etudiant(52503,"BAUDIN","LARDOU",2,1)); listAllEtudiant.add(new Etudiant(52462,"BESSON","CAESAR",3,1)); listAllEtudiant.add(new Etudiant(51899,"BIDEL","LUCILE",4,1)); listAllEtudiant.add(new Etudiant(51816,"BLANC","FANNY",5,2)); listAllEtudiant.add(new Etudiant(51868,"BLANCARD","YANN",1,1)); listAllEtudiant.add(new Etudiant(51163,"BOCHU","JEAN",2,2));
    
}

public static boolean afficherListAllSalle() {
        if(!listAllSalle.isEmpty()) for(int i = 0; i<listAllSalle.size(); i++) Learn.jTextArea41.append("\n"+i+" "+listAllSalle.get(i).getNumSalle());
    return listAllSalle.isEmpty();
}

public static void setListAllSalle() {
    String numero = Learn.jTextField15.getText();
    Salle s = new Salle(numero);
    switch(Learn.jComboBox5.getSelectedIndex()){
            case 0: { s.type = "Amphi"; s.capacite = 25; break; }
            case 1: { s.type = "TP" ; s.capacite = 10; break; }
    }
    s.dispo[0] = Learn.jCheckBox53.isSelected();   s.dispo[1] = Learn.jCheckBox52.isSelected();   s.dispo[2] = Learn.jCheckBox55.isSelected();
    s.dispo[3] = Learn.jCheckBox54.isSelected();   s.dispo[4] = Learn.jCheckBox57.isSelected();   s.dispo[5] = Learn.jCheckBox56.isSelected();
    s.dispo[6] = Learn.jCheckBox59.isSelected();   s.dispo[7] = Learn.jCheckBox58.isSelected();   s.dispo[8] = Learn.jCheckBox61.isSelected();
    s.dispo[9] = Learn.jCheckBox60.isSelected();   s.dispo[10] = Learn.jCheckBox63.isSelected();  s.dispo[11] = Learn.jCheckBox62.isSelected();
    s.dispo[12] = Learn.jCheckBox65.isSelected();  s.dispo[13] = Learn.jCheckBox64.isSelected();  s.dispo[14] = Learn.jCheckBox67.isSelected();
    s.dispo[15] = Learn.jCheckBox66.isSelected();  s.dispo[16] = Learn.jCheckBox69.isSelected();  s.dispo[17] = Learn.jCheckBox68.isSelected();
    s.dispo[18] = Learn.jCheckBox71.isSelected();  s.dispo[19] = Learn.jCheckBox70.isSelected();  s.dispo[20] = Learn.jCheckBox73.isSelected();
    s.dispo[21] = Learn.jCheckBox72.isSelected();  s.dispo[22] = Learn.jCheckBox75.isSelected();  s.dispo[23] = Learn.jCheckBox74.isSelected();

    listAllSalle.add(s);
}

public static Salle getListAllSalle(int index) {
    return listAllSalle.get(index);
}

////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////Enseignant

public static ArrayList<Enseignant> getListAllEnseignant() {
    return listEnseignant;
}

public static Enseignant getEnseignantFromList(int index) {
    return listEnseignant.get(index);
}

public static Cours editEnseignant() {
    Cours c=null; Groupe g=null;
    int indexE = Learn.jList1.getSelectedIndex();
    int index = Learn.jList3.getSelectedIndex();
    c = getCoursFromList(index);
    if(listEnseignant.get(indexE).listCours.size() >= listEnseignant.get(indexE).nbrCoursSemaine)javax.swing.JOptionPane.showMessageDialog(null, "Nombre maximale de charges atteint pour "+listEnseignant.get(indexE).id,"Affectation annulee !",Learn.WIDTH);
      else{  listEnseignant.get(indexE).listCours.add(c);
             index = Learn.jComboBox8.getSelectedIndex();
             g = getGroupeFromList(index);
            listEnseignant.get(indexE).listGroupe.add(g);
            return c;}
    return null;

}

public static Salle getSalleFromList(int index) {
    return null;
}

public static void setListEnseignant() {

    Enseignant e = new Enseignant();
   e.nom = Learn.jTextField7.getText();
   e.prenom = Learn.jTextField3.getText();
   e.dateNaissance = Learn.jTextField5.getText();
   e.adresse = Learn.jTextField4.getText();
   e.ville = Learn.jTextField6.getText();
   e.id = Learn.jTextField8.getText();
   switch(Learn.jComboBox1.getSelectedIndex()){
       case 0: { e.titre ="Maitre_Conference";  break; }
       case 1: { e.titre ="Professeur"; break; }
       case 2: { e.titre ="Doctorant"; break; }
   }
   e.nbrCoursSemaine = Learn.jComboBox3.getSelectedIndex()+1;
   e.charges =  (int)(new Double(Learn.jLabel77.getText())).doubleValue();
   
   e.disponibilite[0][0] = Learn.jCheckBox5.isSelected();    e.disponibilite[0][1] = Learn.jCheckBox4.isSelected();   e.disponibilite[0][2] = Learn.jCheckBox7.isSelected();    e.disponibilite[0][3] = Learn.jCheckBox6.isSelected();   e.disponibilite[0][4] = Learn.jCheckBox9.isSelected();   e.disponibilite[0][5] = Learn.jCheckBox8.isSelected();
   e.disponibilite[1][0] = Learn.jCheckBox11.isSelected();   e.disponibilite[1][1] = Learn.jCheckBox10.isSelected();  e.disponibilite[1][2] = Learn.jCheckBox13.isSelected();   e.disponibilite[1][3] = Learn.jCheckBox12.isSelected();  e.disponibilite[1][4] = Learn.jCheckBox15.isSelected();  e.disponibilite[1][5] = Learn.jCheckBox14.isSelected();
   e.disponibilite[2][0] = Learn.jCheckBox17.isSelected();   e.disponibilite[2][1] = Learn.jCheckBox16.isSelected();  e.disponibilite[2][2] = Learn.jCheckBox19.isSelected();   e.disponibilite[2][3] = Learn.jCheckBox18.isSelected();  e.disponibilite[2][4] = Learn.jCheckBox21.isSelected();  e.disponibilite[2][5] = Learn.jCheckBox20.isSelected();
   e.disponibilite[3][0] = Learn.jCheckBox23.isSelected();   e.disponibilite[3][1] = Learn.jCheckBox22.isSelected();  e.disponibilite[3][2] = Learn.jCheckBox25.isSelected();   e.disponibilite[3][3] = Learn.jCheckBox24.isSelected();  e.disponibilite[3][4] = Learn.jCheckBox27.isSelected();  e.disponibilite[3][5] = Learn.jCheckBox26.isSelected();
   
   listEnseignant.add(e);

}

public static boolean afficherListEnseignant() {
    if(!listEnseignant.isEmpty()){
        Learn.jTextArea41.setText("");
        for(int i = 0; i<listEnseignant.size(); i++){
            Learn.jTextArea41.append("\n"+ i +" "+listEnseignant.get(i).getNom()+" "+listEnseignant.get(i).getPrenom()+"\n");
            ArrayList<Cours> listCoursEnseignant = listEnseignant.get(i).getListCours();
            //Learn.jTextArea41.append("- liste des cours associes :\n");
            for(int j = 0; j<listCoursEnseignant.size(); j++) Learn.jTextArea41.append("\t* "+listCoursEnseignant.get(j).getIntitule()+"");
            ArrayList<Groupe> listGroupeEnseignant = listEnseignant.get(i).getListGroupe();
            //Learn.jTextArea41.append("- liste des groupes pris en charge :\n");
            for(int j = 0; j<listGroupeEnseignant.size(); j++) Learn.jTextArea41.append("	* "+listGroupeEnseignant.get(j).getNomGroupe()+"\n");
            for(int l=0;l<4;l++){
                for(int j=0;j<6;j++){
                    Learn.jTextArea41.append("\t"+listEnseignant.get(i).disponibilite[l][j]);
                }
                Learn.jTextArea41.append("\n");
            }
             //Learn.jTextArea41.append("\n");
        }
    }
    return listEnseignant.isEmpty();
}

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////Cours

public static boolean afficherListAllCours() {
    if(!listAllCours.isEmpty()) for(int i = 0; i<listAllCours.size(); i++) Learn.jTextArea41.append("\n"+i+" "+listAllCours.get(i).getIntitule());
    return listAllCours.isEmpty();
}

public static void setListAllCours() {
        String intitule = Learn.jTextField23.getText();
	int nbrECTS =(int)(new Double(Learn.jTextField26.getText())).doubleValue();
        Cours c = new Cours(intitule,nbrECTS,1,intitule.charAt(0)+intitule.charAt(1)+"");
        switch(Learn.jComboBox11.getSelectedIndex()){
            case 0: { c.coursObligatoire = true; break; }
            case 1: { c.coursObligatoire = false; break; }
        }
        c.nbrHeure = (int)(new Double(Learn.jTextField24.getText())).doubleValue();
        c.nbrCoursWeek =(int)(new Double(Learn.jTextField25.getText())).doubleValue();

	listAllCours.add(c);
	Learn.jTextArea41.append("Le cours ajouté : "+c.getIntitule()+"\n"+c.getNbrHeure()+"\n"+c.getNbrCoursWeek()+"\n"+c.get_ECTS()+"\n"+c.coursObligatoire);

}

public static Cours getCoursFromList(int index) {
    return listAllCours.get(index);
}

////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////Groupe

public static boolean afficherListAllGroupe() {
    if(!listAllGroupe.isEmpty()) for(int i = 0; i<listAllGroupe.size(); i++) Learn.jTextArea41.append("\n"+i+" "+listAllGroupe.get(i).getNomGroupe());
    return listAllGroupe.isEmpty();
}

public static void setListAllGroupe() {
        String nomGroupe = "";
	Groupe g = new Groupe(nomGroupe);
        listAllGroupe.add(g);
}

public static Groupe getGroupeFromList(int index) {
    return listAllGroupe.get(index);
}

public static ArrayList<Groupe> getGroupeList() {
    return listAllGroupe;
}

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////Etudiant

public static boolean afficherListAllEtudiant() {
    Learn.jTextArea41.setText("");
    if(!listAllEtudiant.isEmpty()) for(int i = 0; i<listAllEtudiant.size(); i++)
        Learn.jTextArea41.append(i+" "+listAllEtudiant.get(i).nom+"\t"+listAllEtudiant.get(i).prenom+"\t"+listAllEtudiant.get(i).numeroEtudiant+"\t"+listAllEtudiant.get(i).nomGroupe+"\t"+listAllEtudiant.get(i).semestre+"\n");
    return listAllEtudiant.isEmpty();
}

public static void setListAllEtudiant() {
   Etudiant e = new Etudiant();
   e.nom = Learn.jTextField13.getText();
   e.prenom = Learn.jTextField9.getText();
   e.dateNaissance = Learn.jTextField11.getText();
   e.adresse = Learn.jTextField10.getText();
   e.ville = Learn.jTextField12.getText();
   e.numeroEtudiant = Learn.jTextField14.getText();
   e.semestre = Learn.jComboBox6.getSelectedIndex()+1;
   e.nomGroupe = "G"+Learn.jComboBox7.getSelectedIndex()+1;
   listAllEtudiant.add(e);
}

public static Etudiant getEtudiantFromList(int index) {
    return listAllEtudiant.get(index);
}

public static void editEtudiant() {
  /*  if(!afficherListAllEtudiant()){
       int indexE = sc.nextInt();
       Etudiant e = getEtudiantFromList(indexE);
            Learn.jTextArea41.append("Veuillez choisir un cours de la liste :\n"); //afficher liste des cours
            if (!afficherListAllCours()){
                sc = new Scanner(System.in);
		int index = sc.nextInt();
		Cours c = getCoursFromList(index);
		Enseignement cs =  new Enseignement(c.getIntitule(),c.get_ECTS());
		Learn.jTextArea41.append("Veuillez saisir la note de l'examen\n");
		sc = new Scanner(System.in);
		int note = sc.nextInt();
		cs.setNote(note);
		e.setlistCoursSuivi(cs);
            }
    }*/
}

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////Jour-Horaire

public static boolean afficherListAllJour() {
    if(!listAllJour.isEmpty()) for(int i = 0; i<listAllJour.size(); i++) Learn.jTextArea41.append(i+" "+listAllJour.get(i).getDateJour()+"\n");
    return listAllJour.isEmpty();
}

public static void setListAllJour() {
    String id = "";
    Jour J = new Jour(id, id);
    listAllJour.add(J);
}

public static Jour getListAllJour(int index) {
    return listAllJour.get(index);
}

}