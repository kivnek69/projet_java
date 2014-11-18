package LogicalView;

import java.util.*;

public class Agenda {

  public int nbrEDT;
  public String formation;
  public String semestre;
  public String anneeUniv;
  public ArrayList<EDT> timeTable;

  public Agenda () { };

  private void setNbrEDT ( int newVar ) {
    nbrEDT = newVar;
  }

  private int getNbrEDT ( ) {
    return nbrEDT;
  }

  public void update(  ){  }

}