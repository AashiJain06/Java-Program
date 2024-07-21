import java.util.Scanner;

public class OneDArray {
  public static void main(String[] args) {
    int[] a = new int[4];
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter array elements");
    int i;
    for (i = 0; i < 4; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println(" your array elements are");
    for (i = 0; i < 4; i++) {
      System.out.println(a[i]);
    }

  }

}
