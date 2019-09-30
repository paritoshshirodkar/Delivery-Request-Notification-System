package edu.bu.met.cs665.Observable;

import edu.bu.met.cs665.Observer.ShopObserver;
import java.util.ArrayList;
import java.util.List;


/**
 * This class represents the central system to manage the notifications for all the shops.
 */
public class ShopCentralSystem implements Subject {

  private Shop shop;

  private List<ShopObserver> observerList = new ArrayList<ShopObserver>();

  /**
   * Register an observer to receive notifications from the system.
   */
  @Override
  public void registerObserver(ShopObserver o) {
    observerList.add(o);
  }

  /**
   * Removes an observer from the system. The observer will be unsubscribed.
   */
  @Override
  public void removeObserver(ShopObserver o) {
    observerList.remove(o);
  }

  /**
   * Notifies all of the observers that are registered and added to the list.
   */
  @Override
  public void notifyObservers() {

    // loop over the list and notify each Observer one by one
    for (ShopObserver shopObserver : observerList) {
      shopObserver.update(shop.getShopName(), shop.getDeliveryRequest());
    }

  }

  /**
   * Setter method.
   * @param shop data for shop
   */
  public void setData(Shop shop) {

    this.shop = shop;

    // when we get new delivery request for a shop we notify observers.
    notifyObservers();

  }

  /**
   * Getter method for shop data.
   * @return shop data
   */
  public Shop getData() {
    return this.shop;
  }

}
