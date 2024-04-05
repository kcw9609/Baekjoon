import java.util.Scanner;

public class Baekjoon2839 {
  public static void main(String[] args) {


    // 입력 N
    Scanner s = new Scanner(System.in);
    // 봉지 : 3, 5
    double x = 0; double y = 0;
    double v;double temp = 0;int i=1;int j=1;
    int n; int end = 0;
    // 알 수 없는 경우 -1출력
    n = s.nextInt();
    // 5x + 3y = N(알 수 있는 값)
    /*
     * x = (N - 3y)//5
     * y = (N - 5x)//3
     */
    // 반복, x에 값 대입 후 y값이 나옴 -> 출력
    // 초과됨 -> -1출력
    v = n;
    while(true){
      
      for(; (5 * i)<= v ; i++) { // 5kg짜리 
        // i 에 따라 5키로 개수 확인
        temp = 5 * i;
        x = x + 1;
        // 최대한 넣고 3키로 넣어봄
        // 3키로 안됨 -> 뒤로가서 v의 값을 줄임
        
      }
      
      
      for (; (x*5 + 3*j) <= v ; j++) {
        // 최대한 넣고 3키로 넣어봄
        temp =  x*5 + 3 * j;
        y +=1;
        // 3키로 안됨 -> 뒤로가서 v의 값을 줄임
        if (temp == n) {
          
          System.out.print((int)(x + y));
          end = -1;
          break;
        }
        
      }
      if ( end == -1) { // 성공 시 종료 
        break;
      }
      if ( x == 0 ) { // 실패 시 종료
        // 5키로를 담지 않고 && 3키로도 딱 떨어지지 않을떄
        System.out.print(-1);
        break;
      }
      // 초기화
      temp = 0; x = 0; y = 0;i=1;j=1;
      // v 에 5뺌
      i+=1;

    }
    


  }
}
