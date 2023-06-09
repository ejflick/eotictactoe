package com.experiment;

public class Turn {

  private Turn previous;
  private String player;
  private int row;
  private int column;

  public Turn(Turn previous, String player, int row, int column) {
    this.previous = previous;
    this.player = player;
    this.row = row;
    this.column = column;
  }

  public void take() {

  }

  public Board board() {

  }
  
}
