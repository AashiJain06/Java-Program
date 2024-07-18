public class NumericPattern8 {
  public static void main(String[] args) {

    int i, j, n;
    for (i = 1; i <= 5; i++) {
      n = i;
      for (j = 1; j <= i; j++) {
        System.out.print(" " + n);
        n = n + 5 - j;
      }
      System.out.println();
    }

  }
}
