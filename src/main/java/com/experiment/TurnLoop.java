package com.experiment;

public final class TurnLoop {

  private TurnLoopStep[] steps;
  private int nextStep = 0;

  public TurnLoop(TurnLoopStep... steps) {
    this.steps = steps;
  }

  public void run() {
    while(nextStep().step());
  }

  private TurnLoopStep nextStep() {
    if (nextStep == steps.length) {
      nextStep = 0;
    }

    return steps[nextStep++];
  }

}
