
import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        // set
        Queue<String> queue = new LinkedList<>();
        Queue<Integer> depthQ = new LinkedList<>();
        int[] visit = new int[words.length];
        
        // start
        queue.offer(begin);
        depthQ.offer(0);
      
     // 꺼내기
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            int depth = depthQ.poll();
            // begin값고 같으면 개수 저장
            if (curr.equals(target)) {
                return depth;
            }
            // 두개 맞은 것 넣기 로직
            for (int i = 0; i < words.length ; i ++) {
                // 방문처리 , 스택에 넣기
                if(visit[i] == 0 && isTwoStrike(curr, words[i])) {
                    visit[i] = 1;
                    queue.offer(words[i]);
                    depthQ.offer(depth + 1);
                }

            }
            
        }
        
        
        return 0;
    }

    // 꺼낸거로 조회해서 다시 넣기(한글자 다르면 ㅇㅋ)
    public boolean isTwoStrike(String a, String b) {
        int strike = 0;
        for (int i = 0; i < a.length() ; i ++) {
 
            if(a.charAt(i) == b.charAt(i)) strike += 1;
            //if( a.substring(i, i+1).equals(b.substring(i, i+1))) strike += 1;;
        }
        if (strike == a.length() -1 ) return true;
        else return false;
        
    }

}