package edu.bu.met.cs665.Observer;

/**
 * This class represents a single driver.
 */
public class Driver implements ShopObserver, DisplayNotification {

  private String driverName;
  private String driverType;

  /**
   * A default constructor.
   */
  public Driver() {}


  /**
   * Creates a driver object based on attributes.
   *
   * @param driverName name of the driver
   * @param driverType type of driver
   */
  public Driver(String driverName, String driverType) {
    this.driverName = driverName;
    this.driverType = driverType;
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

  }


  @Override
  public void update() {

  }


}
