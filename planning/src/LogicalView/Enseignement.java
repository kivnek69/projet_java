package LogicalView;

public class Enseignement {

  public int libelle;
  public int priorite;
  public Enseignant enseignant= new Enseignant();
  public Groupe groupe = new Groupe();
  public Cours cours= new Cours();
  public boolean libre;
  public String jour;
  public String heureDebut;
  public int _ECTS;

 public Enseignement(String jourSemaine, String heureDebut, boolean libre) {
	super();
	this.jour = jourSemaine;
	this.heureDebut = heureDebut;
	this.libre = libre;
}
public Enseignement(Enseignant e, Cours c,Groupe g){
    this.enseignant = e;
    this.cours = c;
}
 public Enseignement(String jourSemaine, String heureDebut, boolean libre, Groupe groupePlanifie) {
	super();
	this.jour = jourSemaine;
	this.heureDebut = heureDebut;
	this.libre = libre;
	this.groupe = groupePlanifie;
}
  public void setLibelle ( int newVar ) {
    this.libelle = newVar;
  }

  public int getLibelle ( ) {
    return this.libelle;
  }

  public void setJour ( String newVar ) {
    this.jour = newVar;
  }

  public String getJour ( ) {
    return this.jour;
  }

  public String getJourSemaine() {
	return this.jour;
}
public void setJourSemaine(String jourSemaine) {
	this.jour = jourSemaine;
}

public boolean isLibre() {
	return this.libre;
}
public void setLibre(boolean libre) {
	this.libre = libre;
}
public String getGroupePlanifie() {
	return this.groupe.getNomGroupe();
}
public void setGroupePlanifie(String groupePlanifie) {
	this.groupe.setNomGroupe(groupePlanifie);
}
public String getCoursPlanifie() {
	return this.cours.getIntitule();
}

public void setCoursPlanifie(String coursPlanifie) {
	this.cours.setIntitule(coursPlanifie);
}

public String getEnseignantPlanifie() {
	return this.enseignant.id;
}
public void setEnseignantPlanifie(String enseignantPlanifie) {
	this.enseignant.setId(enseignantPlanifie);
}

public int get_ECTS() {
	return this._ECTS;
}

public void set_ECTS(int ects) {
	this._ECTS = ects ;
}

public String getCodeEns() {
	return this.enseignant.getCode();
}

public String getCodeCours() {
	return this.cours.getCode();
}

}
