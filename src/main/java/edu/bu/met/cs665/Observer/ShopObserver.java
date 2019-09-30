package edu.bu.met.cs665.Observer;

import edu.bu.met.cs665.Observable.DeliveryRequest;
import edu.bu.met.cs665.Observable.Shop;

public interface ShopObserver {

  public void update(String shopName, DeliveryRequest dr);

}
