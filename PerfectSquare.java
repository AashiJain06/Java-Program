import java.util.Scanner;

public class PerfectSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, temp = 0;
    System.out.println("enter number");
    n = sc.nextInt();
    for (int i = 1; i < n; i++) {
      if (i * i == n) {
        temp++;
        break;
      }
    }
    if (temp == 1) {
      System.out.println("number is perfect square");
    } else {
      System.out.println(" number is not perfect Square");
    }

  }

}
