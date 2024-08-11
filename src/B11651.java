import java.util.*;
public class B11651 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[][] p = new int[n][2];

    for(int i =0 ; i<n ; i++){
      p[i][0] = s.nextInt();
      p[i][1] = s.nextInt();
    }

    Comparator comparator = new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        // TODO Auto-generated method stub
        if(o1[1] > o2[1] ) return 1;
        else if(o1[1] == o2[1] && o1[0] > o2[0] ) return 1;
        else return -1;
      }
    };
    
  Arrays.sort(p, comparator);
  for(int i=0 ; i< n ; i++) {
    System.err.println(p[i][0] + " " + p[i][1]);
  }

  }
  
}
