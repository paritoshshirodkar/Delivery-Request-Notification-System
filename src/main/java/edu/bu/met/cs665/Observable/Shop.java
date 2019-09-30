package edu.bu.met.cs665.Observable;
import java.util.ArrayList;
import java.util.List;
import edu.bu.met.cs665.Observable.DeliveryRequest;

/**
 * This class represents a single shop.
 */
public class Shop {

  private String shopName;
  private List<DeliveryRequest> deliveryRequestList = new ArrayList<DeliveryRequest>();

  /**
   * A default constructor.
   */
  public Shop() {}


  /**
   * @param shopName name of the shop
   * @param deliveryRequestList list of delivery requests associated with this shop
   */
  public Shop(String shopName,
      List<DeliveryRequest> deliveryRequestList) {
    this.shopName = shopName;
    this.deliveryRequestList = deliveryRequestList;
  }


  /**
   * Getter method for name of the shop.
   *
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
   * Getter method for list of delivery requests.
   *
   * @return list of delivery requests associated with this shop
   */
  public List<DeliveryRequest> getDeliveryRequestList() {
    return deliveryRequestList;
  }

  /**
   * @param deliveryRequestList list of delivery requests associated with this shop
   */
  public void setDeliveryRequestList(
      List<DeliveryRequest> deliveryRequestList) {
    this.deliveryRequestList = deliveryRequestList;
  }

  /**
   * Method to add a new delivery request for this shop.
   * @param dr delivery request for this shop
   */
  public void addDeliveryRequest(DeliveryRequest dr) {
    this.deliveryRequestList.add(dr);
  }

}
