package LogicalView;

import java.util.*;

public class EDT {

  public String libelle;
  public int nbConflit;
  public ArrayList<Enseignement> ListeEnseignement;
 
  public EDT () { };
 
  private void setLibelle ( String newVar ) {
    libelle = newVar;
  }

  private String getLibelle ( ) {
    return libelle;
  }

}
