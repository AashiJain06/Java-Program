import java.util.Scanner;

public class maximum {
  public static int min(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    return max;
  }

  public static void main(String args[]) {
    int[] a = new int[5];
    Scanner sc = new Scanner(System.in);
    int n = a.length;
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int x = min(a);
    System.out.println(x);
  }

}
