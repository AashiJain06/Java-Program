import java.util.Scanner;

public class Swap {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers");
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("numbers after swaping are");
    c = a;
    a = b;
    b = c;
    System.out.println("a=" + a);
    System.out.println("b=" + b);

  }

}
