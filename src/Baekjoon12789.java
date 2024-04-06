import java.util.*;
public class Baekjoon12789 {

  public static void main(String[] args) {
    /*
     * 다시 줄 대기열로는 갈 수 없음
     * 534 -> 큼 더작 작
     * 5324 -> 작 더작 큼
     * 13(0)-> 작 큼 더작 -> 불가능
     * 더작 작 큼 -> 0
     * 더작 큼 작 -> 0
     * 작 더작 큼 -> 0
     * 작 큼 더작 -> x
     * 큼 더작 작 -> 0
     * 큼 작 더작 -> 0
     */
    // 입력
    List list = new ArrayList<Integer>();
    // 선언
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); int v; int end =0;
    // 입력받기
    for(int i=0 ; i< n ; i++) {
      v = s.nextInt();
      list.add(v);
    }
    // list 에 추가
    
  while (list.size() != 2) { // 3개를 비교하기 위해
    for (int i=0 ; i<=list.size()-2 ; i++) {
      int n1 = (Integer)list.get(i);
      int n2 = (Integer)list.get(i+1);
      int n3 = (Integer)list.get(i+2);
      if(!((n1 < n2) && ( n1 > n3))) {// 작 큼 더작이 아닌경우
        // 더 작은 거 지움
        if((n1 < n2) && (n1 < n3)){
          list.remove(i);
          break;
        }else if((n2 < n1) && (n2 < n3)){
          list.remove(i+1);
          break;
        }else if((n3 < n1) && (n3 < n2)){
          list.remove(i+2);
          break;
        }
      }else {
        System.out.println("Sad");
        end = -1; // while 문 실패 조건
        break;
      }
      
    }
    if(end == -1) { // while문 탈출
      break;
    }
  }
  if(end == 0) { // 성공조건
    System.out.print("Nice");
  }
   
    
  }
  
}
