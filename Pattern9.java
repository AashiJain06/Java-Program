public class Pattern9 {
  public static void main(String[] args) {
    {
      int i, j;
      for (i = 1; i <= 5; i++) {
        for (j = 1; j <= i; j++) {
          if (i == j) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }

}
