package LogicalView;

public class Personne {

  public String nom;
  public String prenom;
  public String dateNaissance;
  public String adresse;
  public String ville;
  public int age;

  public Personne () { };

  private void setNom ( String newVar ) {
    nom = newVar;
  }

  private String getNom ( ) {
    return nom;
  }

  private void setPrenom ( String newVar ) {
    prenom = newVar;
  }

  private String getPrenom ( ) {
    return prenom;
  }

  private void setDateNaissance ( String newVar ) {
    dateNaissance = newVar;
  }

  private String getDateNaissance ( ) {
    return dateNaissance;
  }

  private void setAdresse ( String newVar ) {
    adresse = newVar;
  }

  private String getAdresse ( ) {
    return adresse;
  }

  private void setVille ( String newVar ) {
    ville = newVar;
  }

  private String getVille ( ) {
    return ville;
  }

  private void setAge ( int newVar ) {
    age = newVar;
  }

  private int getAge ( ) {
    return age;
  }

}
