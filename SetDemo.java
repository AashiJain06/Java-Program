import java.util.*;

public class SetDemo {
  public static void main(String[] args) {
    Set s = new HashSet<>();
    System.out.println(s.size());
    s.add(200);
    s.add(500);
    s.add(500);
    s.add(78);
    System.out.println(s.size());
    System.out.println(s);
    Iterator itr = s.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());

    }
  }

}
