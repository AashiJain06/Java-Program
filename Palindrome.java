import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, org = 0;
    int rem, rev = 0;
    System.out.println("enter number");
    n = sc.nextInt();
    org = n;
    while (n != 0) {
      rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }
    if (rev == org) {
      System.out.println("no. is palindrome");
    } else {
      System.out.println(" no. is not palindrome");
    }

  }

}
