package org.example;

public class Employe implements Salary {

  private int year;


  public double calculSalaire() {
    return 1500 + year * 20;
  }
}
