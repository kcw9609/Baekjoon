import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        
        Stack<Integer> stack = new Stack<>();
        // start
        stack.push(arr[0]);
        for(int i = 1 ; i < arr.length ; i++) {
            // stack에 넣기
            // 이전 수와 같으면 제거
            if(stack.peek() == arr[i]) continue;
            stack.push(arr[i]);
        }
        // answer 계산
        int[] answer = new int[stack.size()];
        for(int i = stack.size() - 1 ; i >= 0 ; i --) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}