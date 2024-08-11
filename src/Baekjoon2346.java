import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Baekjoon2346 {
  public static void main(String[] args) {

    /*
     * 1 2 3 4 5 n
     * 1번을 터트림
     * 풍선 제거
     * 1의 번호만큼 움직임
     * (1번의 왼쪽에는 n이 있다)
     * 제거
     * 반복
     */



    // 입력
    Scanner s = new Scanner(System.in);
    Map items = new HashMap<Integer, Integer>();
    int n = s.nextInt(); int movement = 0;
    int now = 0; String printWord="";int before=0;
    for(int i=0 ; i<n ; i++) {
      items.put(i, s.nextInt());
    }
     
    while(items.size()!=0) {
      movement = (Integer)items.get(0);
      items.remove(0);
      now = 0;
      before = 0;
      printWord += "1 ";
      // 출력
      // 위치 이동
      // 인덱스 위치 조정
      if (movement >=0) {
        for(int i =1 ; i< movement  ; i++) {
          if(items.get(i + before) == null) {
            now = 0;
            before = 0;
          }else {
            now = now + 1;
          }
          
        }
        printWord += now +1;
        printWord += " ";
        before = now;
        items.remove(now);
      }else {
        for(int i = 1 ; i > movement +1  ; i--) {
          if(items.get(before - i ) == null) {
            before =0;
            now = 0;
          }else {
            now = now - 1;
          }
          
          
        }
        printWord += now + 1;
          printWord += " ";
          before = now;
          items.remove(now);
      }
      
      

    }
    System.out.println(printWord);


  }  
}
