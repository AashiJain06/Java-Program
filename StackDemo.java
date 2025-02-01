import java.util.*;

public class StackDemo {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<Integer>();
    s.push(23);
    s.push(67);
    s.push(7);
    System.out.println(s);
    s.pop();
    s.pop();
    System.out.println(s);
    System.out.println(s.peek());
    System.out.println(s.isEmpty());
    System.out.println(s.search(45));
    System.out.println(s.size());
    System.out.println(s.capacity());

  }

}
