
import java.util.*;
public class Baekjoon11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] points = new int[n][2];
    

    for(int i=0 ; i<n ; i++){
      points[i][0] = scanner.nextInt();
      points[i][1] = scanner.nextInt();
    }
    for(int i=0 ; i<n -1 ; i++){ // n-1번 반복
      for(int j=i+1 ; j<n ; j++){// 두개씩 비교 후 큰거 temp에 저장 
          if(points[i][0] > points[j][0] || (points[i][0] == points[j][0] && points[i][1]>points[j][1])){
            int[] temp = points[i];
            points[i] = points[j];
            points[j] = temp;

          }
          
      }

    }
    for(int i=0; i<n ; i++){
      System.out.println(points[i][0] + " " + points[i][1]);
    }
		
  }
    // x 비교
        // y 비교 
        // 저장

}