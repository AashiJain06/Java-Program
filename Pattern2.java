public class Pattern2 {
  public static void main(String[] args) {
    int j, i;
    for (i = 1; i <= 10; i++) {
      for (j = 10; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
