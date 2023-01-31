package org.example;

import java.util.ArrayList;
import java.util.List;

public class AvancerTous {

  private List<Robot> robots;
  private List<RobotStatique> robstat;

  public AvancerTous() {

    robots = new ArrayList<Robot>();
    robstat = new ArrayList<RobotStatique>();
  }

  public void avancerTous(){
    for (RobotStatique robotStatique : robstat) {
      robotStatique.avance();
    }
  }

}
