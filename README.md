# Implementation Description

#### Observer Pattern
For this assignment I have used the Observer Pattern. Since the main task was to update all types of Drivers i.e. Taxi and Van Drivers with the Delivery Request, this pattern seemed the most appropriate. Here, the Subject is the delivery request at the shop and the different type of Drivers are the Observers.

For simplicity I have separated the classes and interfaces into two packages - Observable and Observer. 

```
Observable

Subject - This interface specifies the methods to register, remove and notify the Observers.
DeliveryRequest - This class represents a single delivery request.
Shop - This class represents a single shop.
ShopCentralSystem - This class represents the central system used for managing the notifications for all the Observers. 
This class implements the methods to register, remove and notify all the observers (as specifed in the Subject interface).
```


```
Observer

ShopObserver - This interface specifies the method to update the Observers.
DisplayNotification - This interface specifies the method to display the notification to different Observers.
Driver - This class represents a single Driver. It implements the methods specified by ShopObserver and DisplayNotification interface.
TaxiDriver - This class represents a single taxi driver. It overrides displayNotification of Driver class.
VanDriver - This class represents a single van driver. It overrides displayNotification of Driver class.

```
#### Flexibility
This implementation is flexible to the addition of new  types of drivers and subscribing them to different shops without a lot of code modification. This is the reason why Obsever Pattern makes the most sense over here. Neither the Subject nor the Observers are affected by the modifications in each other.
I have used the concept of Inheritance since both the driver types Taxi and Van inherit from the Driver class.
So whenever a new driver type is to be added we just need to create a new class corresponding to it and make sure that it extends the
Driver class. The objects of this new class can then subscribe to the notifications for the desired Shops.


#### Simplicity and Understability
I have implemented logging to demonstrate the working of my implementation.
In case if something goes wrong we can refer to the logs.
This would be useful if we want to simulate the order in which the notifications were sent out.
Overall the implemenntation of any method can also be understood from the comments.


#### Avoiding code duplication
Most instance variables have well defined Getters and Setters hence they can be accessed once the class is instantiated.
Hence there was no need to re-write the code.




# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


