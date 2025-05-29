import java.util.Vector;

public class VectorEx {
  public static void main(String[] args) {

    Vector<Integer> contacts = new Vector<>();
    contacts.add(56);
    contacts.add(47);
    contacts.add(89);
    contacts.add(34);

    System.out.println(contacts);

    System.out.println(contacts.get(3));

    contacts.set(2, 6758);
    System.out.println(contacts);

    contacts.remove(2);
    System.out.println(contacts);

    System.out.println(contacts.size());
  }
}
