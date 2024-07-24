public class ForEachLoop2 {
  public static void main(String[] args) {
    int[][] a = { { 20, 30 }, { 40, 60 } };
    for (int i[] : a) {
      for (int ii : i) {
        System.out.println(i);
      }
    }

  }

}
