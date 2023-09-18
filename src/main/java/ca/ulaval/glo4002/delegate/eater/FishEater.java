package ca.ulaval.glo4002.delegate.eater;

public class FishEater
    implements Eater {

  @Override
  public void eat() {
    System.out.println("je mange du poisson.");
  }
}
