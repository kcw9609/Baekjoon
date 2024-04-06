import java.util.Scanner;

public class Baekjoon2839_1 {
  public static void main(String[] args) {
     // 입력 N
    Scanner s = new Scanner(System.in);
    // 봉지 : 3, 5
    double x = 0; double y = 0;
    double v;double temp = 0; int n=0;

    n = s.nextInt();
    

    // n을 5로 나눔
    // 남은 값을 3으로 나눔 (몫과 나머지)
    // 나머지가 없다 -> 출력
    // 나머지가 있다 -> (몫 -1)* 5 && 3으로 나눔
    // 반복
    int mok = n / 5;
    int namugi = n % 5;

    if(namugi == 0) {
      // 출력
    } else {
      
    }

    // 
  }
  
}
