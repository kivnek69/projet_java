package LogicalView;

import java.util.*;

public class Groupe {
    
  public String nomGroupe;
  private boolean libre;
  public ArrayList<Enseignement> agenda = new ArrayList<Enseignement>();

public Groupe() {
}
public Groupe(String nomGroupe) {
	this.nomGroupe = nomGroupe;
}

public void setNomGroupe ( String newVar ) {
    nomGroupe = newVar;
  }

public String getNomGroupe ( ) {
    return nomGroupe;
}
  
public ArrayList<Enseignement> getAgenda() {
	return agenda;
}
public void setAgenda(Enseignement c) {
	this.agenda.add(c);
}

public boolean isLibre(Enseignement c) {
   for(int j=0; j< PlanningHebdo.listG.size();j++){
       for(int i=0; i<PlanningHebdo.listG.get(j).agenda.size();i++ )
        if( PlanningHebdo.listG.get(j).agenda.get(i).jour.equals(c.jour) && PlanningHebdo.listG.get(j).agenda.get(i).heureDebut.equals(c.heureDebut) && PlanningHebdo.listG.get(j).agenda.get(i).enseignant.nom != null )
                return false;
   }
  return true;
}

}