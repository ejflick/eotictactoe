package com.experiment;

public interface Turn {

  void take();

  Board board();

  public final class Empty implements Turn {
    public Empty() {}

    @Override
    public void take() {
      throw new UnsupportedOperationException("Unimplemented method 'take'");
    }

    @Override
    public Board board() {
      return new EmptyBoard();
    }

  }

}