package LogicalView;

import java.util.*;

public class Enseignant extends Personne {

  public String titre;
  public String code;
  public String id;
  public int nbrCoursSemaine;
  public int charges;
  public boolean[][] disponibilite = new boolean[4][6];
  public ArrayList<Cours> listCours = new ArrayList<Cours>();
  public ArrayList<Groupe> listGroupe = new ArrayList<Groupe>();
  public ArrayList<Enseignement> agenda= new ArrayList<Enseignement>();

public Enseignant(){}

public Enseignant(String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
    this.code = nom.charAt(0)+""+prenom.charAt(0);
    this.nbrCoursSemaine = 2;
    this.id = " "+nom +" "+ prenom;
    for(int i=0;i<4;i++)
        for(int j=0;j<5;j++){
            this.disponibilite[i][j] = false;
        }
}


  public void setTitre ( String newVar ) {
    titre = newVar;
  }

  public String getTitre ( ) {
    return titre;
  }

  public void setId ( String newVar ) {
    id = newVar;
  }

  public String getId ( ) {
    return id;
  }

  public void setNbrCoursSemaine ( int newVar ) {
    nbrCoursSemaine = newVar;
  }

  public int getNbrCoursSemaine ( ) {
    return nbrCoursSemaine;
  }

  public void consulteAgenda(  ){
  }

  public void creeEvenement(  ){
  }

  public void modifieEvenement(  ){
  }

  public void supprimeEvenement(  ){
  }

public int getChargeEnseignant() {
    return listGroupe.size()*listCours.size();
}


public String getNom() {
    return nom;
}

public void setNom(String nom) {
    this.nom = nom;
}

public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public void AddCours(Cours c) {
    listCours.add(c);
}

public String getCode() {
    return this.code;
}

public ArrayList<Cours> getListCours() {
    return listCours;
}

public void AddGroupe(Groupe g) {
    listGroupe.add(g);
}

public ArrayList<Groupe> getListGroupe() {
    return listGroupe;
}

public void setAgenda(Enseignement c) {
    this.agenda.add(c);
}

public ArrayList<Enseignement> getAgenda() {
    return agenda;
}

public boolean isLibre(int c) {
    int i=0,j=0;
    if(c<5){         i=0;j=c; }
     else if(c<10){  i=1;j=c-5; }
      else if(c<15){ i=2;j=c-10;}
       else {        i=3;j=c-15;}
 return this.disponibilite[i][j];
}


}
