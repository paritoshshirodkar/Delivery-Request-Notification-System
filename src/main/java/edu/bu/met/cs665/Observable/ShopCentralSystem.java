package edu.bu.met.cs665.Observable;

import java.util.ArrayList;
import java.util.List;
import edu.bu.met.cs665.Observer.ShopObserver;

/**
 * This class represents the central system to manage the notifications for all the shops.
 */
public class ShopCentralSystem implements Subject {

  private Shop shop;
  private DeliveryRequest dr;

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
   *
   */
  @Override
  public void notifyObservers() {

    // loop over the list and notify each Observer one by one
    for (ShopObserver shopObserver : observerList) {
      shopObserver.update(shop.getShopName(), dr.getCustomerName(), dr.getProductName(), dr.getAddressLine1(), dr.getAddressLine2());
    }

  }

  public void setData(Shop shop, DeliveryRequest dr) {

    this.shop.addDeliveryRequest(dr);

    // when we get new delivery request for a shop we notify observers.
    notifyObservers();

  }

}
