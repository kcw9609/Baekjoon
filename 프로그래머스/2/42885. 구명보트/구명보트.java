import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // set
        int left = 0;
        int right = people.length -1;
        Arrays.sort(people);
        // 가벼운 사람 + 무거운 사람 조합으로 담기
        while (left < right) {
            // 태울 수 있음 -> 태움 
            if ( people[left] + people[right] <= limit ) {
                answer += 1;
                left ++; right --;
            } else { // 태울 수 없음 -> 무거운사람 혼자 타기
                answer ++;
                right --;
                
            }
            
        }
        // 마지막 처리
        if (left == right) answer ++;
        return answer;
    }
}