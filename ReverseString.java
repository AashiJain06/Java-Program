import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String name, rev;
    System.out.println("enter string");
    name = sc.next();
    int n, i;
    n = name.Length;
    for (i = n - 1; i >= 0; i--) {
      rev = rev + name.charAt(i);
    }
    System.out.println(rev);

  }
}
