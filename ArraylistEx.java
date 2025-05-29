import java.util.ArrayList;
import java.util.List;

public class ArraylistEx {
  public static void main(String[] args) {
    List<String> companyNames = new ArrayList<>();
    companyNames.add("Ford");
    companyNames.add("Suzuki");
    companyNames.add("Hyundai");
    companyNames.add("Mahindra");

    System.out.println(companyNames);

    System.out.println("Elements at index 2 :" + companyNames.get(2));

    companyNames.set(1, "BMW");
    System.out.println(companyNames);

    companyNames.remove(1);
    System.out.println(companyNames);

    System.out.println("Size of this arraylist : " + companyNames.size());

    System.out.println("Looping now");
    for (String name : companyNames) {
      System.out.println(name);
    }
  }

}