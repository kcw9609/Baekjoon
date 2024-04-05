
import java.util.ArrayList;
import java.util.Iterator;

class Baekjoon25083 {

  public static void main(String[] args) {
    ArrayList list = new ArrayList<String>();
    list.add(new String("         ,r'\"7"));
    list.add(new String("r`-_   ,'  ,/"));
    list.add(new String(" \\. \". L_r'"));
    list.add(new String("   `~\\/"));
    list.add(new String("      |"));
    list.add(new String("      |"));

    Iterator it = list.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}