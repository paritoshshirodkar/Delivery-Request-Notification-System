package edu.bu.met.cs665.Observer;

/**
 * This class represents a single taxi driver.
 */
public class TaxiDriver extends Driver {

  private String driverType;

  /**
   * A constructor which calls the constructor of Driver class.
   */
  public TaxiDriver(String driverName) {
    super(driverName);
    setDriverType("Taxi");
  }

  /**
   * Getter method for type of the driver.
   *
   * @return type of the driver
   */
  public String getDriverType() {
    return driverType;
  }


  /**
   * @param driverType type of the driver
   */
  public void setDriverType(String driverType) {
    this.driverType = driverType;
  }


  @Override
  public void displayNotification() {
    System.out.println(" [Taxi driver Notification] " + " Driver Type: " + getDriverType() + " Driver Name: " + getDriverName() + " Shop Name: " + getShopName() + " Customer Name: " + dr.getCustomerName() +
        " Product Name: " + dr.getProductName() + " Address Line 1: " + dr.getAddressLine1() + " Address Line 2: " + dr.getAddressLine2());


  }


}
