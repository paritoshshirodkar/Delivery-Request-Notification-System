package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.Observable.DeliveryRequest;
import edu.bu.met.cs665.Observer.ShopObserver;
import org.junit.Test;
import edu.bu.met.cs665.Observable.ShopCentralSystem;
import edu.bu.met.cs665.Observable.Shop;
import edu.bu.met.cs665.Observer.Driver;
import edu.bu.met.cs665.Observer.TaxiDriver;
import edu.bu.met.cs665.Observer.VanDriver;

public class TestNotification {

  ShopCentralSystem centralSystem = new ShopCentralSystem();

  Driver vd1 = new VanDriver("vd1");
  Driver vd2 = new VanDriver("vd2");
  Driver td1 = new TaxiDriver("td1");
  Driver td2 = new TaxiDriver("td2");
  Driver td3 = new TaxiDriver("td3");




  DeliveryRequest ddr1 = new DeliveryRequest("Paritosh", "Book", "Comm. Ave.", "Boston");
  DeliveryRequest ddr2 = new DeliveryRequest("Tom", "T-Shirt", "Comm. Ave.", "Boston");

  Shop s1 = new Shop("Barnes and Noble", ddr1);
  Shop s2 = new Shop("Nike", ddr2);


  @Test
  public void testNotificationShopName() {

    centralSystem.registerObserver(vd1);
    centralSystem.registerObserver(vd2);
    centralSystem.registerObserver(td1);
    centralSystem.registerObserver(td2);
    centralSystem.registerObserver(td3);

    centralSystem.setData(s1);

    assertEquals(vd1.getShopName(), "Barnes and Noble");
    assertEquals(vd2.getShopName(), "Barnes and Noble");
    assertEquals(td1.getShopName(), "Barnes and Noble");
    assertEquals(td2.getShopName(), "Barnes and Noble");
    assertEquals(td3.getShopName(), "Barnes and Noble");

    centralSystem.setData(s2);

    assertEquals(vd1.getShopName(), "Nike");
    assertEquals(vd2.getShopName(), "Nike");
    assertEquals(td1.getShopName(), "Nike");
    assertEquals(td2.getShopName(), "Nike");
    assertEquals(td3.getShopName(), "Nike");


  }


  @Test
  public void testNotificationCustomerName() {

    centralSystem.registerObserver(vd1);
    centralSystem.registerObserver(vd2);
    centralSystem.registerObserver(td1);
    centralSystem.registerObserver(td2);
    centralSystem.registerObserver(td3);

    centralSystem.setData(s1);

    assertEquals(vd1.getDr().getCustomerName(), "Paritosh");
    assertEquals(vd2.getDr().getCustomerName(), "Paritosh");
    assertEquals(td1.getDr().getCustomerName(), "Paritosh");
    assertEquals(td2.getDr().getCustomerName(), "Paritosh");
    assertEquals(td3.getDr().getCustomerName(), "Paritosh");

    centralSystem.setData(s2);

    assertEquals(vd1.getDr().getCustomerName(), "Tom");
    assertEquals(vd2.getDr().getCustomerName(), "Tom");
    assertEquals(td1.getDr().getCustomerName(), "Tom");
    assertEquals(td2.getDr().getCustomerName(), "Tom");
    assertEquals(td3.getDr().getCustomerName(), "Tom");
  }


  @Test
  public void testNotificationProductName() {

    centralSystem.registerObserver(vd1);
    centralSystem.registerObserver(vd2);
    centralSystem.registerObserver(td1);
    centralSystem.registerObserver(td2);
    centralSystem.registerObserver(td3);

    centralSystem.setData(s1);

    assertEquals(vd1.getDr().getProductName(), "Book");
    assertEquals(vd2.getDr().getProductName(), "Book");
    assertEquals(td1.getDr().getProductName(), "Book");
    assertEquals(td2.getDr().getProductName(), "Book");
    assertEquals(td3.getDr().getProductName(), "Book");

    centralSystem.setData(s2);

    assertEquals(vd1.getDr().getProductName(), "T-Shirt");
    assertEquals(vd2.getDr().getProductName(), "T-Shirt");
    assertEquals(td1.getDr().getProductName(), "T-Shirt");
    assertEquals(td2.getDr().getProductName(), "T-Shirt");
    assertEquals(td3.getDr().getProductName(), "T-Shirt");
  }


  @Test
  public void testNotificationAddressLine1() {

    centralSystem.registerObserver(vd1);
    centralSystem.registerObserver(vd2);
    centralSystem.registerObserver(td1);
    centralSystem.registerObserver(td2);
    centralSystem.registerObserver(td3);

    centralSystem.setData(s1);

    assertEquals(vd1.getDr().getAddressLine1(), "Comm. Ave.");
    assertEquals(vd2.getDr().getAddressLine1(), "Comm. Ave.");
    assertEquals(td1.getDr().getAddressLine1(), "Comm. Ave.");
    assertEquals(td2.getDr().getAddressLine1(), "Comm. Ave.");
    assertEquals(td3.getDr().getAddressLine1(), "Comm. Ave.");

    centralSystem.setData(s2);

    assertEquals(vd1.getDr().getAddressLine1(), "Comm. Ave.");
    assertEquals(vd2.getDr().getAddressLine1(), "Comm. Ave.");
    assertEquals(td1.getDr().getAddressLine1(), "Comm. Ave.");
    assertEquals(td2.getDr().getAddressLine1(), "Comm. Ave.");
    assertEquals(td3.getDr().getAddressLine1(), "Comm. Ave.");
  }


  @Test
  public void testNotificationAddressLine2() {

    centralSystem.registerObserver(vd1);
    centralSystem.registerObserver(vd2);
    centralSystem.registerObserver(td1);
    centralSystem.registerObserver(td2);
    centralSystem.registerObserver(td3);

    centralSystem.setData(s1);

    assertEquals(vd1.getDr().getAddressLine2(), "Boston");
    assertEquals(vd2.getDr().getAddressLine2(), "Boston");
    assertEquals(td1.getDr().getAddressLine2(), "Boston");
    assertEquals(td2.getDr().getAddressLine2(), "Boston");
    assertEquals(td3.getDr().getAddressLine2(), "Boston");

    centralSystem.setData(s2);

    assertEquals(vd1.getDr().getAddressLine2(), "Boston");
    assertEquals(vd2.getDr().getAddressLine2(), "Boston");
    assertEquals(td1.getDr().getAddressLine2(), "Boston");
    assertEquals(td2.getDr().getAddressLine2(), "Boston");
    assertEquals(td3.getDr().getAddressLine2(), "Boston");
  }

  @Test
  public void testNotificationDriverName() {

    centralSystem.registerObserver(vd1);
    centralSystem.registerObserver(vd2);
    centralSystem.registerObserver(td1);
    centralSystem.registerObserver(td2);
    centralSystem.registerObserver(td3);

    centralSystem.setData(s1);

    assertEquals(vd1.getDriverName(), "vd1");
    assertEquals(vd2.getDriverName(), "vd2");
    assertEquals(td1.getDriverName(), "td1");
    assertEquals(td2.getDriverName(), "td2");
    assertEquals(td3.getDriverName(), "td3");

    centralSystem.setData(s2);

    assertEquals(vd1.getDriverName(), "vd1");
    assertEquals(vd2.getDriverName(), "vd2");
    assertEquals(td1.getDriverName(), "td1");
    assertEquals(td2.getDriverName(), "td2");
    assertEquals(td3.getDriverName(), "td3");
  }


}
