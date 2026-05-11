import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        // 스택에 넣어서 
        // time 계산
        // 작은게 들어오면 빼서 time을 저장하기
        int time = 0; int index = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < prices.length ; i ++) {
            int curr = prices[i];
            
            while(!st.isEmpty() && curr < prices[st.peek()]) {
                
                int idx = st.pop();
                answer[idx] = i - idx;
            }
            // 넣기, 인덱스 추가
            
            st.push(i);
        }
       while(!st.isEmpty()) {
           int idx = st.pop();
           answer[idx] = prices.length - 1 - idx;
       }
        
        
        return answer;
    }
}