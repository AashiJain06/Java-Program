import java.util.*;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap<Integer, String> hs = new HashMap<Integer, String>();
    hs.put(101, "Aashi");
    hs.put(102, "Riya");
    hs.put(104, "Anurag");
    hs.put(109, "Ashok");
    hs.put(108, "Rekha");
    System.out.println(hs);
    Set set = hs.entrySet();
    System.out.println(set);
    Iterator itr = set.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

  }

}
