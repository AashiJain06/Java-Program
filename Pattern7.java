public class Pattern7 {
  public static void main(String[] args) {
    int i, j, k, l;
    for (i = 0; i <= 5; i++) {
      for (j = 5; j >= i; j--) {
        System.out.print(" ");
      }
      for (k = 1; k <= i; k++) {
        System.out.print("*");
      }
      for (l = 2; l <= i; l++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
