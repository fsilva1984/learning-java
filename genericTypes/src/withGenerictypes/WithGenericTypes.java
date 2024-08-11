package withGenerictypes;

import java.util.ArrayList;
import java.util.List;

public class WithGenericTypes {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();

    integerList.add(28);
    integerList.add(45);
    integerList.add(73);
    integerList.add(34);
    integerList.add(48);

    for (Integer i : integerList) {
      System.out.println(i);
    }
  }
}
