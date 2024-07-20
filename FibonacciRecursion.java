public class FibonacciRecursion {
  static int a = 0, b = 1, c;

  public static void main(String[] args) {
    FibonacciRecursion ob = new FibonacciRecursion();
    ob.printfb(10);
  }

  void printfb(int i) {
    if (i >= 1) {

      c = a + b;
      System.out.println(c);
      a = b;
      b = c;
      printfb(i - 1);
    }
  }

}
