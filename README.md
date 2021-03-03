# kafka-java-app
## Team Lead:
### Sowmya Thogiti

* My gitHub profile is [Sowmya thogiti](https://github.com/sowmyathogiti)  
* I have created kafka java application which generates longitide and latitude values by random number and populate date and time respectively.

#### Steps to Follow to work on kafka java app:
* Start zookeeper service from C:\kafka_2.13-2.6.0 with command: .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
* Start kafka service from C:\kafka_2.13-2.6.0 with command: .\bin\windows\kafka-server-start.bat .\config\server.properties
* Clean and compile code using command from the root project folder: mvn clean compile assembly:single
* Start consumer with command: java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata15.Consumer sowmya group15
* Start producer with command: java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata15.ProducerBySowmya

#### Reference:
[https://github.com/denisecase/kafka-api](https://github.com/denisecase/kafka-api)    
[https://github.com/cloudera/kafka-examples](https://github.com/cloudera/kafka-examples)

## Team Members:
### Vigneshwar Reddy Lenkala
 
* My GitHub profile: [Vigneshwar Reddy Lenkala](https://github.com/vigneshwar6666) 

### Commands used to get the Random numbers in the range:

* Start the Zookeeper service in the powershell using the command below where you installed Kafka.
* .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
* Start the Kafka service in the powershell using the command below where you installed kafka.
* .\bin\windows\kafka-server-start.bat .\config\server.properties
  
To compile and build the jar file, run the following commands in the project root folder.

* To compile and assemble the code
* mvn clean compile assembly:single
* To start the consumer
* java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata.group6.Consumer test group1
* To start the producer
* java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata.group6.RohanProducer test

### References
[https://gist.github.com/kleysonr/d76df87479cc884818ebe870d297d7e5](https://gist.github.com/kleysonr/d76df87479cc884818ebe870d297d7e5)
  
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
