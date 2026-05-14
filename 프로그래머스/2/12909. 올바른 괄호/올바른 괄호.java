import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        // stack에 삽입
        Stack<Character> st = new Stack<Character>();
        
        // 문자열 자르기
        Character[] ch = new Character[s.length()];
        for(int i = 0 ; i < s.length() ; i ++) {
            ch[i] = s.charAt(i);
        }
        
        // start
        st.push(ch[0]);
        
        for(int i = 1 ; i < s.length() ; i ++) {
            // 비어있는 경우
            if(st.isEmpty()) {
                st.push(ch[i]); continue;
            }
                
            char popped = st.pop();
            // ( 뒤에 )면 두개 pop
            if (!(popped == '(' && ch[i] == ')')) {
                st.push(popped);
                st.push(ch[i]);
            }

        }
        
        if(st.isEmpty()) answer = true;

        return answer;
    }
}