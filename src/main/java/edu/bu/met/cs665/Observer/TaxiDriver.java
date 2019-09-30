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
    System.out.println("\n [Taxi Driver Notification] " + "\n Driver Type: " + getDriverType() + "\n Driver Name: " + getDriverName() + "\n Shop Name: " + getShopName() + "\n Customer Name: " + dr.getCustomerName() +
        "\n Product Name: " + dr.getProductName() + "\n Address Line 1: " + dr.getAddressLine1() + "\n Address Line 2: " + dr.getAddressLine2());


  }


}
