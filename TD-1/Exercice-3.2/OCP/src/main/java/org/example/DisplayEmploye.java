package org.example;

public class DisplayEmploye {

  private final String nom;
  private final String adresse;

  public DisplayEmploye(String nom, String adresse) {
    this.nom = nom;
    this.adresse = adresse;
  }

  @Override
  public String toString() {
    return nom + " , " + adresse;
  }


}
