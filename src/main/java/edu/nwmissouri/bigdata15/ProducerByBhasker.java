package edu.nwmissouri.bigdata15;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.*;
import java.lang.*;


public class ProducerByBhasker {

    private static Scanner scan;

    public static void main(String[] argv) throws Exception {
      if (argv.length != 1) {
        System.err.println("Please specify 1 parameter (the name of the topic)");
        System.exit(-1);
      }
    //   System.out.print("Enter a topic name: ");
      String topicName = argv[0];
      scan = new Scanner(System.in);
      System.out.println("Thank you for providing the topic " + topicName + "\n");
      System.out.println("Enter message (type exit to quit).\n");
  
      // Configure the Producer
      Properties configProperties = new Properties();
      configProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
      configProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
          "org.apache.kafka.common.serialization.ByteArraySerializer");
      configProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
          "org.apache.kafka.common.serialization.StringSerializer");
  
  
      System.out.println("The configuration properties are: " + configProperties.toString());
      System.out.println("\nWill use this configuration to create a producer.\n");
  
      org.apache.kafka.clients.producer.Producer producer = new KafkaProducer(configProperties);
  
      // Make our own messages - create your custom logic here
      for (int i = 1; i <= 10; i++) {
          String message = randomSentence();
          ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName, message);
          producer.send(rec);
        }
    
        // still allow input from keyboard
    
        String line = scan.nextLine();
        while (!line.equals("exit")) {
          ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName, line);
          producer.send(rec);
          line = scan.nextLine();
        }
    
        scan.close();
        producer.close();
    
      }
    
      private static String randomSentence() {
  
        String[] sports = { "Cricket", "Football", "Hockey", "Racing", "Basketball", "Vollyball", "Badminton", "Tokudubilla" };
        // String[] players = { "Jerry", "Rohit", "Tom", "William", "Sowmya", "Vignesh", "Bhasker" };
        String[] assign = { "is assigned", "is not assigned", "can play", "cannot play" };
        String[] time = { "12pm", "2pm", "10am", "4pm", "5pm", "8am" };
    
        Random r = new Random();
    
        int count = 3;
        int minIndex = 0;
        int maxIndex = 4;
    
        int[] randoms = r.ints(count, minIndex, maxIndex).toArray();
    
        return sports[randoms[0]] + " " + assign[randoms[1]] + " at " + time[randoms[2]]+ ".";
    }
  }