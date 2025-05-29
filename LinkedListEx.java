import java.util.*;

public class LinkedListEx {

  public static void main(String[] args) {
    LinkedList<String> cityNames = new LinkedList<>();

    cityNames.add("Durgapur");
    cityNames.add("Dantan");
    cityNames.add("Kolkata");
    cityNames.add("Midnapore");
    cityNames.add("Delhi");

    System.out.println("Citynames are:  " + cityNames);

    cityNames.remove("Dantan");
    System.out.println("Citynames are:  " + cityNames);

    cityNames.remove(1);
    System.out.println("Citynames are:  " + cityNames);

    cityNames.removeFirst();
    System.out.println("Citynames are:  " + cityNames);

    cityNames.removeLast();
    System.out.println("Citynames are:  " + cityNames);

    // LinkedList<String> cityNames2 = (LinkedList<String>) cityNames.clone();
    // cityNames.set(0, "Hyderabad");

    // System.out.println("Citynames are: " + cityNames);
    // System.out.println("coloned citynames2: " + cityNames2);
  }
}