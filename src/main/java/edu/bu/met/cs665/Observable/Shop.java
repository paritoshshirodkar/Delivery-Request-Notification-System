package edu.bu.met.cs665.Observable;
import edu.bu.met.cs665.Observable.DeliveryRequest;

/**
 * This class represents a single shop.
 */
public class Shop {

  private String shopName;
  private DeliveryRequest deliveryRequest = new DeliveryRequest();

  /**
   * A default constructor.
   */
  public Shop() {}


  /**
   * @param shopName name of the shop
   * @param deliveryRequest delivery request associated with this shop
   */
  public Shop(String shopName, DeliveryRequest deliveryRequest) {
    this.shopName = shopName;
    this.deliveryRequest = deliveryRequest;
  }


  /**
   * Getter method for name of the shop.
   * @return name of the shop
   */
  public String getShopName() {
    return shopName;
  }

  /**
   * @param shopName name of the shop
   */
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * Getter method for delivery request.
   * @return delivery request associated with this shop
   */
  public DeliveryRequest getDeliveryRequest() {
    return deliveryRequest;
  }

  /**
   * @param deliveryRequest delivery request associated with this shop
   */
  public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
    this.deliveryRequest = deliveryRequest;
  }

}
