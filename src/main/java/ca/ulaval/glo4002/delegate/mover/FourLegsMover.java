package ca.ulaval.glo4002.delegate.mover;

public class FourLegsMover
    implements Mover {

  @Override
  public void move() {
    System.out.println("je marche à quatre pattes.");
  }
}
