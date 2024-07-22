import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n, temp;
    int digits = 0;
    int rem, sum = 0;
    n = s.nextInt();
    temp = n;
    while (n != 0) {
      n = n / 10;
      digits++;
    }
    n = temp;
    while (n != 0) {
      rem = n % 10;
      sum += Math.pow(rem, digits);
      n = n / 10;

    }
    if (sum == temp) {
      System.out.println("number is armstrong");
    } else {
      System.out.println(" number is not armstrong");
    }

  }

}
