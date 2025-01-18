import java.util.*;

public class ListDemo {
  public static void main(String[] args) {
    List l = new ArrayList<>();
    l.add(20);
    l.add(1, 30);
    l.add(null);
    l.add("aashi");
    l.remove(0);
    System.out.println(l);
    Iterator itr = l.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());

    }
  }

}
