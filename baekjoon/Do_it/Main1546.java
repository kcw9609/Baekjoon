package Do_it;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Main1546 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr;
    int  max=0;
    double sum = 0;
    int sub = sc.nextInt();
    arr = new int[sub];

    for(int i=0 ; i<sub ; i++ ) {

      int gd = sc.nextInt();
      arr[i] = gd;
      if(gd > max) max=gd;
    }

    for(int i=0 ; i<sub ; i++) {
      sum += arr[i]/(double)max*100;
    }
    System.out.println(sum/sub);

  }
}