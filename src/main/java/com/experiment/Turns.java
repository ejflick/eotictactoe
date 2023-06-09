package com.experiment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public final class Turns {

  private final TurnLoop turnLoop;
  private final ArrayList<Turn> turns;
  
  public Turns() {
    this.turns = new ArrayList<>(new Turn.Empty());
    this.turnLoop = new TurnLoop();
  }

  public void takeTurn(String player, int row, int column) {

  }

  public void takeUntilEnd() {
    turnLoop.run();
  }

}
