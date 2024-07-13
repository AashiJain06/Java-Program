import java.util.Scanner;

public class SwapWithoutThirdVariable {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers");
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("numbers after swaping are");
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a=" + a);
    System.out.println("b=" + b);

  }

}
