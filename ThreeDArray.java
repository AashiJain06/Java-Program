public class ThreeDArray {
  public static void main(String[] args) {
    int[][][] a = { { { 10, 20 }, { 30, 40, 50, 60 }, { 70, 80 } } };
    int i, j, k;
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++)

      {
        for (k = 0; k < a[i][j].length; k++) {
          System.out.print(a[i][j][k] + " ");
        }
        System.out.println();
      }
    }

  }

}
