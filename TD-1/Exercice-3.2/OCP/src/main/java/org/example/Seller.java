package org.example;

public class Seller extends Employe {

  private double commission;

  public Seller(double commission) {
    this.commission = commission;
  }

  @Override
  public double calculSalaire() {
    return super.calculSalaire() + commission;
  }

}
