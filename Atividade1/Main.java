package Atividade1;

public class Main {
  public static void main(String[] args) {
      for (int i = 1; i <= 10; i++) {
          Thread thread = new Thread(new NumberPrinter(i));
          thread.start();
      }
  }
}
