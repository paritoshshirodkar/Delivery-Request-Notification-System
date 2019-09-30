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


  @Test
  public void testNotification() {

    ShopCentralSystem centralSystem = new ShopCentralSystem();

    Driver td1 = new TaxiDriver("td1");
    Driver vd1 = new VanDriver("vd1");


    centralSystem.registerObserver(td1);
    centralSystem.registerObserver(vd1);

    DeliveryRequest ddr1 = new DeliveryRequest("Paritosh", "Book", "Comm. Ave.", "Boston");
    DeliveryRequest ddr2 = new DeliveryRequest("Paritosh", "T-Shirt", "Comm. Ave.", "Boston");

    Shop s1 = new Shop("s1", ddr1);
    centralSystem.setData(s1);

    assertEquals(td1.getDriverName(), "td1");





  }


}
