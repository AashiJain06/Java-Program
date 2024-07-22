import java.util.Scanner;

public class FcatorialByRecursion {
  static int fact = 1;

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    FcatorialByRecursion ob = new FcatorialByRecursion();
    int n;
    System.out.println("enter number");
    n = s.nextInt();
    ob.calculate(n);
    System.out.println(" factorial is" + fact);

  }

  void calculate(int n) {
    if (n >= 1) {
      fact = fact * n;
      calculate(n - 1);
    }
  }

}
