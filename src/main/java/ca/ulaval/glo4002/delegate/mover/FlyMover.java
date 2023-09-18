package ca.ulaval.glo4002.delegate.mover;

public class FlyMover
    implements Mover {

  @Override
  public void move() {

    System.out.println("je vole avec mes ailes.");
  }
}
