import java.util.Scanner;

public class TwoDArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[3][4];
    System.out.println("enter array elements");
    int i, j;
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 4; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println(" your matrix is");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 4; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

  }

}
