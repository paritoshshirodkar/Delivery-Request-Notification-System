package edu.bu.met.cs665.Observable;

/**
 * This class represents a single delivery request.
 */

public class DeliveryRequest {

  private String customerName;
  private String productName;
  private String addressLine1;
  private String addressLine2;

  /**
   * A default constructor.
   */
  public DeliveryRequest() {}

  /**
   * Create a delivery request based on attributes.
   * @param customerName name of the customer
   * @param productName name of the product
   * @param addressLine1 first line of the customer address
   * @param addressLine2 second line of the customer address
   */
  public DeliveryRequest(String customerName, String productName, String addressLine1, String addressLine2) {
    this.customerName = customerName;
    this.productName = productName;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
  }

  /**
   * Getter method for customer name.
   * @return customer name
   */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * @param customerName name of the customer
   */
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  /**
   * Getter method for product name.
   * @return product name
   */
  public String getProductName() {
    return productName;
  }

  /**
   * @param productName name of the product
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * Getter method for first line of customer address.
   * @return first line of the customer address
   */
  public String getAddressLine1() {
    return addressLine1;
  }

  /**
   * @param addressLine1 first line of the customer address
   */
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  /**
   * Getter method for second line of customer address.
   * @return second line of the customer address
   */
  public String getAddressLine2() {
    return addressLine2;
  }

  /**
   * @param addressLine2 second line of the customer address
   */
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }
}
