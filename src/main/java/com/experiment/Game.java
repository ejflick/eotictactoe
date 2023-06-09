package com.experiment;

final public class Game {

  private final Turns turns;

  public Game() {
    this.turns = new Turns();
  }

  public void run() {
    turns.takeUntilEnd();
  }

}
