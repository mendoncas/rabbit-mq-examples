package com.example;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;

public class App {
    private final static String EXCHANGE_NAME = "logs";
    private final static Random gen = new Random();

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        try (Connection connection = factory.newConnection();
                Channel channel = connection.createChannel()) {
            channel.exchangeDeclare(EXCHANGE_NAME, "direct");
            String message = ("This is a log from the log producer ;)");
            while (true) {
                String sev = severity();
                channel.basicPublish(EXCHANGE_NAME, sev, null, message.getBytes());
                System.out.println(" [x] Sent '" + message + "'" + "to qeueue " + sev);
                Thread.sleep(3000);
            }
        }
    }

    private static String severity() {
        return String.valueOf(gen.nextInt(3));
    }
}
