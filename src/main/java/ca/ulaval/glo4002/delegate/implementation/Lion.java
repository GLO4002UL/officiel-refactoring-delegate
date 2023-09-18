package ca.ulaval.glo4002.delegate.implementation;

import ca.ulaval.glo4002.delegate.Animal;
import ca.ulaval.glo4002.delegate.eater.MeatEater;
import ca.ulaval.glo4002.delegate.mover.FourLegsMover;

public class Lion
    extends Animal {

  public Lion() {
    super(new FourLegsMover(), new MeatEater());
  }
}
