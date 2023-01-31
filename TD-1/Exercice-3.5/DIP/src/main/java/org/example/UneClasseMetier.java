package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UneClasseMetier {

  static final Logger logger = LogManager.getLogger();

  /**
   * Une méthode métier.
   */
  public void uneMethodeMetier() {
    logger.debug("Début de uneMethodeMetier");

    // Traitements métiers

    logger.debug("Fin de uneMethodeMetier");
  }

}
