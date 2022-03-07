package com.example;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws TimeoutException
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, TimeoutException {
        Receiver.consume();
    }

}
