package lab.aikibo.bo.impl;

import lab.aikibo.bo.SpptBo;
import lab.aikibo.manager.SpptManager;

public class SpptBoImpl implements SpptBo {
  SpptManager spptManager;

  
  public void setSpptManager(SpptManager spptManager) {
    this.spptManager = spptManager;
  }

  public Sppt getDataIndividual(String nop, String thn) {
    return SpptManager.getDataIndividual(nop, thn);
  }
}