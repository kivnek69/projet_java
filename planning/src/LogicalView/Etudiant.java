package LogicalView;

import java.util.*;

public class Etudiant extends Personne {

  public String numeroEtudiant;
  private int anneeUniv;
  public String nomGroupe;
  double noteGlobal;
  String Admis;
  int semestre;
  public ArrayList<Enseignement> listCoursSuivi = new ArrayList<Enseignement>();
  public ArrayList<Double> listNoteCoursSuivi = new ArrayList<Double>();

public Etudiant (){}

public Etudiant(int numeroEtudiant,String nom, String prenom, int nomGroupe, int semestre){
    this.numeroEtudiant = ""+numeroEtudiant;
    this.nom = nom;
    this.prenom = prenom;
    this.nomGroupe = "G"+nomGroupe;
    this.semestre = semestre;
}

public Etudiant(String groupe) {
    nomGroupe = groupe;
	}

public ArrayList<Enseignement> getlistCoursSuivi() {
		return listCoursSuivi;
	}

	public void calculNoteGlobal() {
		if(!listCoursSuivi.isEmpty()){
			for(int i = 0; i<this.listCoursSuivi.size(); i++){
			   this.noteGlobal += this.listNoteCoursSuivi.get(i);
			}
			this.noteGlobal /= this.listCoursSuivi.size();
	      }
	}


	public void setlistCoursSuivi(Enseignement c) {
		listCoursSuivi.add(c);
	}

	public void setAdmis() {
		this.calculNoteGlobal();
		if(this.noteGlobal >= 10) {this.Admis = "Admis";}
		else{this.Admis = "Non admis";}
	}

	public String getAdmis() {
		return this.Admis;
	}

        public String getNomGroupe(){
            return nomGroupe;
        }
  private void setNumeroEtudiant ( String newVar ) {
    numeroEtudiant = newVar;
  }

  private String getNumeroEtudiant ( ) {
    return numeroEtudiant;
  }

  private void setAdmis ( String newVar ) {
    Admis = newVar;
  }

  private void setAnneeUniv ( int newVar ) {
    anneeUniv = newVar;
  }

  private int getAnneeUniv ( ) {
    return anneeUniv;
  }

  public void consulteEDT(  )
  {
  }

}
