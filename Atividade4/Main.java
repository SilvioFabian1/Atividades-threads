package Atividade4;

import java.util.concurrent.*;

public class Main {
  public static void main(String[] args) {
    final int MAX_CAPACITY = 10;
    BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(MAX_CAPACITY);

    Thread producer = new Thread(() -> {
      try {
        for (int i = 0; i < 20; i++) {
          System.out.println("Produzindo: " + i);
          buffer.put(i);
          Thread.sleep(1000);
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    });

    Thread consumer = new Thread(() -> {
      try {
        while (true) {
          System.out.println("Consumindo: " + buffer.take());
          Thread.sleep(1000);
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    });

    producer.start();
    consumer.start();
  }
}
