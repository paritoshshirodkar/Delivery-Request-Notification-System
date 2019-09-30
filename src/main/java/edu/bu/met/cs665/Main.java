package edu.bu.met.cs665;

import edu.bu.met.cs665.Observable.DeliveryRequest;
import edu.bu.met.cs665.Observable.Shop;
import edu.bu.met.cs665.Observable.ShopCentralSystem;
import edu.bu.met.cs665.Observer.ShopObserver;
import edu.bu.met.cs665.Observer.TaxiDriver;
import edu.bu.met.cs665.Observer.VanDriver;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import edu.bu.met.cs665.*;


public class Main {

  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    PropertyConfigurator.configure("log4j.properties");

    ShopCentralSystem centralSystem = new ShopCentralSystem();

    ShopObserver vd1 = new VanDriver("vd1");
    ShopObserver vd2 = new VanDriver("vd2");
    ShopObserver td1 = new TaxiDriver("td1");
    ShopObserver td2 = new TaxiDriver("td2");
    ShopObserver td3 = new TaxiDriver("td3");

    centralSystem.registerObserver(vd1);
    centralSystem.registerObserver(vd2);
    centralSystem.registerObserver(td1);
    centralSystem.registerObserver(td2);
    centralSystem.registerObserver(td3);


    DeliveryRequest ddr1 = new DeliveryRequest("Paritosh", "Book", "Comm. Ave.", "Boston");
    DeliveryRequest ddr2 = new DeliveryRequest("Tom", "T-Shirt", "Comm. Ave.", "Boston");


    Shop s1 = new Shop("Barnes and Noble", ddr1);
    Shop s2 = new Shop("Nike", ddr2);


    centralSystem.setData(s1);
    centralSystem.setData(s2);



  }

}
