import java.util.Scanner;

public class B1934 {

  public  static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[][] list = new int[n][2];

    for(int i =0 ; i<n ; i++){
      list[i][0] = s.nextInt();
      list[i][1] = s.nextInt();
    }
    for(int i=0 ; i< n ; i++){
    int gcd = gcd(list[i][0], list[i][1]);
    int lcm = list[i][0] * list[i][1];

    int answer = lcm / gcd;
    System.err.println(answer);

    }
    // for(int i = list[0] ; i<)
    
    


  }
  public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
  
}