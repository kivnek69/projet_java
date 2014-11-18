package LogicalView;

import java.util.*;

public class Administrateur extends Personne {

  private Date debutContrat;
  private String typeContrat;
  private int anneeExperience;

  public Administrateur () { };

  private void setDebutContrat ( Date newVar ) {
    debutContrat = newVar;
  }

  private Date getDebutContrat ( ) {
    return debutContrat;
  }

  private void setTypeContrat ( String newVar ) {
    typeContrat = newVar;
  }

  private String getTypeContrat ( ) {
    return typeContrat;
  }

  private void setAnneeExperience ( int newVar ) {
    anneeExperience = newVar;
  }

  private int getAnneeExperience ( ) {
    return anneeExperience;
  }

  public void creeRessource(  ){
  }

  public void modifieRessource(  ){
  }

  public void supprimeRessource(  ){
  }

  public void consulteRessource(  ){
  }

  public void consulteConflit(  ){
  }

  public void supprimerconflit(  ){
  }
  
}
