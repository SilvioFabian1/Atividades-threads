package Atividade2;

class CountThread extends Thread {
  private int start;
  private int end;

  public CountThread(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public void run() {
    for (int i = start; i <= end; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      System.out.println(i);
    }
  }
}
