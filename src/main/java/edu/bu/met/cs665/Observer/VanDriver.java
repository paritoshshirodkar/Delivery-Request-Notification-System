package edu.bu.met.cs665.Observer;

import org.apache.log4j.Logger;

/**
 * This class represents a single van driver.
 */
public class VanDriver extends Driver {

  private static Logger vanDriverLogger = Logger.getLogger(VanDriver.class);
  private String driverType;

  /**
   * A constructor which calls the constructor of Driver class.
   */
  public VanDriver(String driverName) {
    super(driverName);
    setDriverType("Van");
  }

  /**
   * Getter method for type of the driver.
   * @return type of the driver
   */
  public String getDriverType() {
    return driverType;
  }


  /**
   * Setter method.
   * @param driverType type of the driver
   */
  public void setDriverType(String driverType) {
    this.driverType = driverType;
  }


  @Override
  public void displayNotification() {
    vanDriverLogger.info("\n [Van Driver Notification] "
        + "\n Driver Type: " + getDriverType()
        + "\n Driver Name: " + getDriverName()
        + "\n Shop Name: " + getShopName()
        + "\n Customer Name: " + dr.getCustomerName()
        + "\n Product Name: " + dr.getProductName()
        + "\n Address Line 1: " + dr.getAddressLine1()
        + "\n Address Line 2: " + dr.getAddressLine2());

  }

}
