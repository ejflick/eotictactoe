package com.experiment;

public class PlayerTurn implements Turn {

  private Turn previous;
  private String player;
  private int row;
  private int column;

  public PlayerTurn(Turn previous, String player, int row, int column) {
    this.previous = previous;
    this.player = player;
    this.row = row;
    this.column = column;
  }

  @Override
  public void take() {

  }

  @Override
  public Board board() {
    return board;
  }
  
}
