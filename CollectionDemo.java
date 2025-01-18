import java.util.*;

public class CollectionDemo {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add(100);
    al.add(200);
    System.out.println(al);
    System.out.println(al);
    HashSet hs = new HashSet();
    hs.add("aashi");
    hs.add("jain");
    System.out.println(hs);
    hs.addAll(al);
    System.out.println(hs);
    System.out.println(hs.size());

  }

}
