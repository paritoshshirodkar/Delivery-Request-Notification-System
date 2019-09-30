package edu.bu.met.cs665.Observable;

import edu.bu.met.cs665.Observer.ShopObserver;

public interface Subject {

  /**
   * Register an observer to our list of observers.
   *
   * @param o the observer object
   */
  public void registerObserver(ShopObserver o);

  /**
   * remove an observer from our observer list.
   *
   * @param o
   */
  public void removeObserver(ShopObserver o);

  /**
   * Notify all observers.
   */
  public void notifyObservers();


}
