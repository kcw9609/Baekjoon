import java.io.IOException;
import java.util.Scanner;

public class Baekjoon2720 {

  public static void main(String[] args){
    // quarter : 0.25, dime : 0.10
    // nickel : 0.05, penny : 0.01

    // T 입력받기
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt(); int c =0; String s="";

    for(int i=0 ; i<T ; i++) {
      c = scanner.nextInt();
      // C를 25로 나눈 몫 출력
       int v = c/25;
       s += String.valueOf(v);
       s += " ";
       // 나머지를 10으로 나눈 몫 출력
       v = c%25/10;
       s += String.valueOf(v);
       s += " ";
       // 나머지를 5로 나눈 몫 출력
       v = c%25%10/5;
       s += String.valueOf(v);
       s += " ";
       // 나머지 출력
       v = c%25%10%5/1;
       s += String.valueOf(v);
       s += "\n";

    }
    System.out.println(s);   
    
}
  
}
