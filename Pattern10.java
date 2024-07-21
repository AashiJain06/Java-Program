public class Pattern10 {
  public static void main(String[] args) {
    int i, j, k;
    for (i = 0; i <= 5; i++) {
      for (j = 5; j >= i; j--) {
        System.out.print(" ");
      }
      for (k = 1; k < (i * 2); k++) {
        if (k > 1 && k < (i * 2) - 1) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }

}
