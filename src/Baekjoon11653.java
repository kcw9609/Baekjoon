import java.util.Scanner;

public class Baekjoon11653 {
  
  public static void main(String[] args) {

    // 입력 값 N
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); int namugi = 0; int temp;
    // 나누기 처음부터 다시
    // 나눠서 나머지가 정수인 경우 -> 통과
    temp = n;
    while( temp > 1 ) {/**r값이 1? 일떄까지 */

      for (int i= 2; ; i++) {
        
        if (temp / (double)i <= temp / i) { // 소인수분해
          temp = temp / i ;
          System.out.println(i);
          break;
        }
        // 소인수분해 x -> 다시 반복
        
      }
    }
    // 정수 x -> 다음 수로 나눠보기 반복
    // 출력
  }
}
