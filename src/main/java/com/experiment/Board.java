package com.experiment;

public interface Board {

  boolean finished();

  /**
   * Finds out the winner of the game.
   * 
   * @return "X" if x won, "O" if o won, "TIE" if there's a tie
   */
  String result();

  boolean print();

  void occupy(String player, int row, int column);

}