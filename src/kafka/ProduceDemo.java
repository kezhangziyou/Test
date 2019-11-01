package kafka;

import org.apache.kafka.clients.producer.*;

import java.util.ArrayList;
import java.util.Properties;

public class ProduceDemo {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "172.24.9.60:6667");
        props.put("acks", "all");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer(props);
        for (int i = 0; i < 10; i++) {
            producer.send(new ProducerRecord<String, String>("lstest", Integer.toString(i), Integer.toString(i)));
            System.out.println("发送消息"+i);

        }
        producer.close();
    }
}
