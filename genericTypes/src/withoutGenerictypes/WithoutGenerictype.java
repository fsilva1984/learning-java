package withoutGenerictypes;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerictype {
public static void main(String[] args) {
  List list = new ArrayList();
  list.add("Arvore");
  list.add('R');
  list.add(123);
  list.add(12.93);
  list.add(1239862349L);

  for (Object obj : list) {
    System.out.println(obj);
  }
}
}
