import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String name;
    String rev = "";
    System.out.println("enter string");
    name = sc.next();
    int n;
    n = name.length();
    for (int i = n - 1; i >= 0; i--) {
      rev = rev + name.charAt(i);
    }
    System.out.println(rev);

  }
}
