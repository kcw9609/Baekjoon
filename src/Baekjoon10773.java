import java.util.*;
public class Baekjoon10773 {
  public static void main(String[] args) {
    List list = new ArrayList<Integer>();

    Scanner s = new Scanner(System.in);
    int k = s.nextInt(); int v; int hap =0;

    for(int i=0 ; i < k ; i++) {
      v = s.nextInt();
      if(v == 0) {
        list.remove(list.size() -1);
      }else {
        list.add(v);
      }
      
    }
    Iterator it = list.iterator();
    while(it.hasNext()){
      hap += (Integer)(it.next());
    }
    System.out.print(hap);

  }
  
}
