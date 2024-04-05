import java.util.Scanner;

public class Baekjoon2869 {
  public static void main(String[] args) {

    // 입력 A B V
    // (A - B)X >= V
    // ad - b(d-1) >= v
    // ad -bd + b >= v
    // d(a-b) >= v-b

    Scanner s = new Scanner(System.in);
    int a, b, v, d;
    a = s.nextInt();
    b = s.nextInt();
    v = s.nextInt();

    if ( ((v - b) / (a - b)) < ((double)(v-b) / (a - b)) ) {
      d = (v-b) / (a - b) +1;
    }else {
      d = (v-b) / (a - b);
    }

    System.out.println(d);

  }
  
}
