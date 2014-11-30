package LogicalView;

public class Cours {

  public String type;
  public String libelle;
  public String code;
  public boolean coursObligatoire;
  public int _ECTS;
  public int nbrHeure;
  public int nbrCoursWeek;

public Cours(){}

  public Cours (String libelle, int _ECTS, int nbrCoursWeek, String code) {
      this.libelle = libelle;
      this._ECTS = _ECTS;
      this.code = code;
      this.nbrCoursWeek = nbrCoursWeek;
  }

    public Cours (String libelle, int _ECTS, int nbrCoursWeek, boolean coursObligatoire, String code ) {
      this.libelle = libelle;
      this._ECTS = _ECTS;
      this.code = code;
      this.nbrCoursWeek = nbrCoursWeek;
      this.coursObligatoire = coursObligatoire;
  }
  public void setType ( String newVar ) {
    this.type = newVar;
  }

  public String getType ( ) {
    return this.type;
  }

  public void setIntitule ( String newVar ) {
    this.libelle = newVar;
  }

  public String getIntitule ( ) {
    return this.libelle;
  }

  public void setCoursObligatoire ( boolean newVar ) {
    this.coursObligatoire = newVar;
  }

  public boolean getCoursObligatoire ( ) {
    return this.coursObligatoire;
  }

  public void set_ECTS ( int newVar ) {
    this._ECTS = newVar;
  }

  public int get_ECTS ( ) {
    return this._ECTS;
  }
public String getCode ( ) {
    return this.code;
  }
  public void setNbrHeure ( int newVar ) {
    this.nbrHeure = newVar;
  }

  public int getNbrHeure ( ) {
    return this.nbrHeure;
  }

  public int getNbrCoursWeek() {
    return this.nbrCoursWeek;
  }

  public void setNbrCoursWeek(int nbrCoursWeek) {
    this.nbrCoursWeek = nbrCoursWeek;
  }

}
