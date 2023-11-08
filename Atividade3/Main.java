package Atividade3;

public class Main {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int total = Summation.parallelSum(arr);
    System.out.println("Soma total: " + total);
  }
}
