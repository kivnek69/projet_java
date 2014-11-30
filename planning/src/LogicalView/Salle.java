package LogicalView;

public class Salle {

  public String numero;
  public int capacite;
  public String type;
  public boolean[] dispo = new boolean[24];

  public Salle (String numSalle) {
    this.numero = numSalle ;
  }

  public void setNumSalle ( String newVar ) {
    numero = newVar;
  }

  public String getNumSalle ( ) {
    return numero;
  }

  public void setCapacite ( int newVar ) {
    capacite = newVar;
  }

  public int getCapacite ( ) {
    return capacite;
  }

  public void setType ( String newVar ) {
    type = newVar;
  }

  public String getType ( ) {
    return type;
  }

  public void setNumero(  ){
  }

}