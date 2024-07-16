import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, i;
    int count = 0;
    System.out.println("enter number");
    n = sc.nextInt();
    for (i = 2; i <= n - 1; i++) {
      if (n % i == 0) {
        count++;
      }

    }
    if (count == 0) {
      System.out.println(" prime number");
    } else {
      System.out.println("not a prime munber");
    }

  }

}
