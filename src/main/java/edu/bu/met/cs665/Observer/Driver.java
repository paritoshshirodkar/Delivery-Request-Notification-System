package edu.bu.met.cs665.Observer;

import edu.bu.met.cs665.Observable.DeliveryRequest;
import edu.bu.met.cs665.Observable.Shop;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * This class represents a single driver.
 */
public class Driver implements ShopObserver, DisplayNotification {

  private static Logger driverLogger = Logger.getLogger(Driver.class);

  private String driverName;
  protected String shopName;
  protected DeliveryRequest dr;
  /**
   * A default constructor.
   */
  public Driver() {

  }


  /**
   * Creates a driver object based on attributes.
   * @param driverName name of the driver
   */
  public Driver(String driverName) {
    this.driverName = driverName;
  }


  /**
   * Getter method for name of the driver.
   * @return name of the driver
   */
  public String getDriverName() {
    return driverName;
  }


  /**
   * Setter method.
   * @param driverName name of the driver
   */
  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  @Override
  public void displayNotification() {
    driverLogger.info("\n [Basic Notification] " + "\n Driver Name: " + getDriverName() + "\n Shop Name: " + getShopName()
        + "\n Customer Name: " + dr.getCustomerName() + "\n Product Name: " + dr.getProductName()
        + "\n Address Line 1: " + dr.getAddressLine1() + "\n Address Line 2: " + dr.getAddressLine2());


  }


  @Override
  public void update(String shopName, DeliveryRequest dr) {
    this.shopName = shopName;
    this.dr = dr;

    // when we get new data we display it.
    this.displayNotification();
  }


  /**
   * Getter method for the name of the shop.
   * @return name of the shop
   */
  public String getShopName() {
    return shopName;
  }

  /**
   * Setter method.
   * @param shopName name of the shop
   */
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * Getter method for the delivery request.
   * @return delivery request
   */
  public DeliveryRequest getDr() {
    return dr;
  }

  /**
   * Setter method.
   * @param dr delivery request
   */
  public void setDr(DeliveryRequest dr) {
    this.dr = dr;
  }
}
