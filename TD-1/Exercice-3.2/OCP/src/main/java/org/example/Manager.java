package org.example;

public class Manager extends Employe {

  private int nbpers;

  @Override
  public double calculSalaire() {
    return super.calculSalaire() + nbpers * 100;
  }

}
