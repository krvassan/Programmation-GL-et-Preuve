package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UneClasseMetier {


  /**
   * Une méthode métier.
   */
  public void uneMethodeMetier(LoggerInterface logger) {
    logger.write("Début de uneMethodeMetier");

    // Traitements métiers

    logger.write("Fin de uneMethodeMetier");
  }

}
