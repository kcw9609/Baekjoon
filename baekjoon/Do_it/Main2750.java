package Do_it;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Main2750 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();

    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0 ; i< count ; i++) {
      int num = scanner.nextInt();
      arr.add(num);
    }
    arr.sort(new Comparator<Integer>(){
      public int compare(Integer a, Integer b) {
        return a.compareTo(b);
      }});
    for(int a: arr) {
      System.out.println(a);
    }
  }
  
}
