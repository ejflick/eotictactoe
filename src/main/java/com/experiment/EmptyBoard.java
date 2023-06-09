package com.experiment;

final public class EmptyBoard implements Board {

  public EmptyBoard() {}

  @Override
  public boolean finished() {
    return false;
  }

  @Override
  public String result() {
    throw new UnsupportedOperationException("Unimplemented method 'result'");
  }

  @Override
  public boolean print() {
    System.out.println("[No turns taken]");
  }

  @Override
  public void occupy(
    final String player,
    final int row,
    final int column
    ) {
    new OccupiedBoard();
  }
  
}
