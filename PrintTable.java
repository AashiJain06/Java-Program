import java.util.Scanner;

public class PrintTable {
  public static void main(String[] args) {

    int n, i;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number you want to print the table");
    n = sc.nextInt();
    for (i = 1; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + n * i);
    }

  }
}
