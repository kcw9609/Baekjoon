import java.util.*;
public class B12615 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] length = new int[3];
    // 영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.

    // 입력
    for(int i =0 ; i<3 ; i++) {
      length[i] = s.nextInt();
    }
    // 정렬
    Arrays.sort(length);
    
    int nextLength=0, longLength=0, smallLength=0;
    int tSize = 0;
    
        smallLength = length[0];
        nextLength = length[1];
        longLength = length[2];

         if(smallLength + nextLength <= longLength) {
 
         }
         if(smallLength + nextLength > longLength) {
          tSize =  smallLength + nextLength + longLength;
         }

        // et, t 비교
    int et = length[0] * 3;
    if(et > tSize) System.out.println(et);
    else {System.out.println(tSize);}

    
  }}

