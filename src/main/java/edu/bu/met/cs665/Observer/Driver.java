package edu.bu.met.cs665.Observer;

import edu.bu.met.cs665.Observable.DeliveryRequest;
import edu.bu.met.cs665.Observable.Shop;

/**
 * This class represents a single driver.
 */
public class Driver implements ShopObserver, DisplayNotification {

  private String driverName;
  protected Shop shop;
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
    System.out.println(" [Basic Notification] " + " Driver Name: " + getDriverName() + " Shop Name: " + shop.getShopName() + " Customer Name: " + dr.getCustomerName() +
        " Product Name: " + dr.getProductName() + " Address Line 1: " + dr.getAddressLine1() + " Address Line 2: " + dr.getAddressLine2());
  }


  @Override
  public void update(String shopName, String customerName, String productName, String addressLine1, String addressLine2) {
    this.dr = new DeliveryRequest(customerName, productName, addressLine1, addressLine2);
    shop.addDeliveryRequest(dr);
  }

  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  public DeliveryRequest getDr() {
    return dr;
  }

  public void setDr(DeliveryRequest dr) {
    this.dr = dr;
  }
}
