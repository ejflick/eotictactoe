package com.experiment;

public class BoardCell {

  private String occupant;

  public BoardCell() {
    this.occupant = " ";
  }

  public BoardCell(String occupant) {
    this.occupant = occupant;
  }

  public void occupy(String occupant) {
    this.occupant = occupant;
  }

  public String occupant() {
    return this.occupant;
  }

}
