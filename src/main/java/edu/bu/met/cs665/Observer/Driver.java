package edu.bu.met.cs665.Observer;

/**
 * This class represents a single driver.
 */
public class Driver implements ShopObserver, DisplayNotification {

  private String driverName;

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

  }


  @Override
  public void update() {

  }


}
