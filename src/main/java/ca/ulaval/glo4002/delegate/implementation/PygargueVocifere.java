package ca.ulaval.glo4002.delegate.implementation;

import ca.ulaval.glo4002.delegate.Animal;
import ca.ulaval.glo4002.delegate.eater.FishEater;
import ca.ulaval.glo4002.delegate.mover.FlyMover;

public class PygargueVocifere
    extends Animal {

  public PygargueVocifere() {
    super(new FlyMover(), new FishEater());
  }
}
