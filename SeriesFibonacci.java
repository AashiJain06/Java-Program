public class SeriesFibonacci {
  public static void main(String[] args) {
    int a, b, c, i;
    a = 0;
    b = 1;
    System.out.println(a);
    System.out.println(b);
    for (i = 1; i <= 10; i++) {
      c = a + b;
      System.out.println(c);

      a = b;
      b = c;
    }

  }

}
