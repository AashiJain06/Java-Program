import java.util.*;

public class MapDemo {
  public static void main(String[] args) {
    HashMap<Integer, String> hs = new HashMap<Integer, String>();
    hs.put(101, "Aashi");
    hs.put(102, "Jain");
    hs.put(103, "Riya");
    System.out.println(hs);
    System.out.println(hs.size());
    System.out.println(hs.get(101));
    System.out.println(hs.isEmpty());
    hs.remove(102);
    System.out.println(hs);
    System.out.println(hs.containsKey(101));
    System.out.println(hs.values());
    System.out.println(hs.entrySet());
  }

}
