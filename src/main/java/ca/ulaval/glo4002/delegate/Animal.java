package ca.ulaval.glo4002.delegate;

import ca.ulaval.glo4002.delegate.eater.Eater;
import ca.ulaval.glo4002.delegate.mover.Mover;

public class Animal
    implements Mover, Eater {

  private final Mover mover;

  private final Eater eater;

  public Animal(Mover mover, Eater eater) {
    this.mover = mover;
    this.eater = eater;
  }

  @Override
  public void move() {
    mover.move();
  }

  @Override
  public void eat() {
    eater.eat();
  }
}

