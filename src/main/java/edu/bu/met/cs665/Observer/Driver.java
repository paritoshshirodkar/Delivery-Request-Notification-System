package edu.bu.met.cs665.Observer;

import edu.bu.met.cs665.Observable.DeliveryRequest;
import edu.bu.met.cs665.Observable.Shop;
import java.util.List;

/**
 * This class represents a single driver.
 */
public class Driver implements ShopObserver, DisplayNotification {

  private String driverName;
  protected String shopName;
  protected DeliveryRequest dr;
  /**
   * A default constructor.
   */
  public Driver() {}


  /**
   * Creates a driver object based on attributes.
   *
   * @param driverName name of the driver
   *
   */
  public Driver(String driverName) {
    this.driverName = driverName;
  }


  /**
   * Getter method for name of the driver.
   *
   * @return name of the driver
   */
  public String getDriverName() {
    return driverName;
  }


  /**
   * @param driverName name of the driver
   */
  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  @Override
  public void displayNotification() {
//    System.out.println(" [Basic Notification] " + " Driver Name: " + getDriverName() + " Shop Name: " + shop.getShopName() + " Customer Name: " + dr.getCustomerName() +
//        " Product Name: " + dr.getProductName() + " Address Line 1: " + dr.getAddressLine1() + " Address Line 2: " + dr.getAddressLine2());
    System.out.println("basic display");

  }


  @Override
  public void update(String shopName, DeliveryRequest dr) {
    this.shopName = shopName;
    this.dr = dr;

    // when we get new data we display it.
    this.displayNotification();
  }


  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public DeliveryRequest getDr() {
    return dr;
  }

  public void setDr(DeliveryRequest dr) {
    this.dr = dr;
  }
}
