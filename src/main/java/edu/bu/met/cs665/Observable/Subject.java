package edu.bu.met.cs665.Observable;

import edu.bu.met.cs665.Observer.ShopObserver;

/**
 * This interface specifies an Observable or Subject in Observer Pattern.
 */

public interface Subject {

  /**
   * Register an observer to our list of observers.
   *
   * @param o the observer object
   */
  public void registerObserver(ShopObserver o);

  /**
   * Remove an observer from our observer list.
   *
   * @param o
   */
  public void removeObserver(ShopObserver o);

  /**
   * Notify all observers.
   */
  public void notifyObservers();


}
