# kafka-java-app
## Team Lead:
### Sowmya Thogiti

* My gitHub profile is [Sowmya thogiti](https://github.com/sowmyathogiti)

## Team Members:
### Vigneshwar Reddy Lenkala
 
* My GitHub profile: [Vigneshwar Reddy Lenkala](https://github.com/vigneshwar6666) 

### Rohitha Reddy Meda
For my custom producer package I have used java code to identify prime numbers in given set of numbers.

### Setting up the Kafka
* Open PowerShell in C:\kafka_2.13-2.7.0 folder.
* Use a different PowerShell window for each process.
Window 1 - Run Zookeeper Service (keep window open)
```PowerShell
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
Window 2 - Run Kafka Service (keep window open)
```PowerShell
.\bin\windows\kafka-server-start.bat .\config\server.properties
```
Window 3 - Create your topic name
```PowerShell
.\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --create --topic rohitha-kafka
```
### Compile and build the jar file
Open PowerShell as Administrator in your root project folder
```PowerShell
mvn clean compile assembly:single
```
Start Consumer
```PowerShell
java -cp target/kafka-api-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata15
```
Start Producer
```PowerShell
java -cp target/kafka-api-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata15
```
### Vineetha Yenugula

* My Github Profile: [Vineetha Yenugula](https://github.com/vineetha1996)

#### Created kafka-evenodd application
* In this application i have taken maximum number as 50, minimum number as 10 and range as "max - min + 1".
 #### Random number generation: 
 "rand = (int)(Math.random() * range) + min".
* This app will let us know whether the randomly generated integer is even or odd.

* Link to my implemented kafka-evenodd app repository: [Kafka-EvenOdd](https://github.com/vineetha1996/kafka-evenodd)


### Bhaskar Reddy Minupuri

* My Github Profile: [Bhaskar Reddy Minupuri](https://github.com/Bhaskar2909)
