package ca.ulaval.glo4002.delegate.eater;

public class MeatEater
    implements Eater {

  public MeatEater() {
  }

  @Override
  public void eat() {
    System.out.println("je mange de la viande.");
  }
}
