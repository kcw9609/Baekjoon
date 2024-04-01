package baekjoon;
import java.util.Scanner;

public class Baekjoon2231 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //N을 입력받기
    int N = scanner.nextInt();
    
    
    //자기자신+ 각자리수합이 N과 같으면 저장..비교?
    int result=0;
    int number = 0;

    while(true){//123
      result = number;
      int tmp= number;
      while(true){//각 자릿수의 합 구하기
        if(tmp%10 == 0)break; //3
        result += tmp%10;//6
        tmp = tmp/10;

      }
      if(result == N){
        System.out.println(number);break;
      }
      if(number >= N){System.out.println("0");break;}
      //리셋하기
      tmp=0;
      result = 0;
      number+=1;
    }
  }
}

