package com.experiment;

import java.util.LinkedList;

final public class Turns {

  private final TurnLoop turnLoop;
  private final LinkedList<Turn> turns;
  
  public Turns() {
    this.turns    = new LinkedList<>();
    this.turnLoop = new TurnLoop();
  }

  public void takeTurn(String player, int row, int column) {
    turns.addFirst(
      new Turn(turns, player, row, column)
    );
  }

  public void takeUntilEnd() {

    turnLoop.run();
  }

}
