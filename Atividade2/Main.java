package Atividade2;

public class Main {
  public static void main(String[] args) {
    CountThread thread1 = new CountThread(1, 5);
    CountThread thread2 = new CountThread(6, 10);
    thread1.start();
    thread2.start();
  }
}
