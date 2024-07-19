public class SeriesPrime {
  public static void main(String[] args) {
    int i, j, temp = 0;
    for (i = 1; i <= 100; i++) {
      for (j = 2; j <= (i - 1); j++) {
        if (i % j == 0) {
          temp++;
        }
      }
      if (temp == 0) {
        System.out.print(i + " ");
      } else {
        temp = 0;
      }
    }
  }

}
