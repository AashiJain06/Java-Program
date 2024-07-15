import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, fact, i;
    fact = 1;
    System.out.println("enter no. you want to find factorial");
    n = sc.nextInt();
    for (i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println(fact);

  }

}
