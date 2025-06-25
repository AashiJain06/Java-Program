import java.util.Scanner;

public class minimum {

  public static int min(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min)
        min = arr[i];
    }
    return min;
  }

  public static void main(String args[]) {
    int[] a = new int[10];
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
