import java.util.*;

public class VectorDemo {
  public static void main(String[] args) {
    Vector v = new Vector();
    v.addElement(23);
    v.addElement(56);
    System.out.println(v);
    v.removeElement(56);
    System.out.println(v);
    System.out.println(v.lastElement());
    System.out.println(v.capacity());

  }
}