import java.util.TreeMap;

public class TreeMapDemo {
  public static void main(String[] args) {
    TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    map.put(103, "Aashi");
    map.put(101, "Riya");
    map.put(105, "Radhika");
    map.put(109, "Neha");
    System.out.println(map);
    System.out.println(map.ceilingEntry(105));
    System.out.println(map.ceilingKey(102));
    System.out.println(map.higherEntry(105));
    System.out.println(map.firstEntry());
    System.out.println(map.floorEntry(102));
    System.out.println(map.get(103));
    System.out.println(map.keySet());
    System.out.println(map.pollLastEntry());
    System.out.println(map);

  }

}
