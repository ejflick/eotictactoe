package com.experiment;

public final class Game {

  private final Turns turns;

  public Game() {
    this.turns = new Turns();
  }

  public void run() {
    turns.takeUntilEnd();
  }

}
