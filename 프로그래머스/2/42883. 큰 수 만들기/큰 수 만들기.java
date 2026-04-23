import java.util.*;
class Solution {
    public String solution(String number, int k) {
        
        StringBuilder sb = new StringBuilder();
        
        
        // set
        for ( int i = 0 ; i < number.length() ; i ++) {
            char c = number.charAt(i);
            
            // sb비교해서 작으면 빼기 반복
            while(k > 0 && sb.length() > 0 && sb.charAt(sb.length() -1) < c) {
                sb.deleteCharAt(sb.length() - 1);
                k --;
                
            }
            sb.append(c);
        }
        // 남은 k에 대해서 뒤의 것 자르기
        if (k > 0) {
            return sb.substring(0, sb.length() - k );
        }
        return sb.toString();
        
    }
}