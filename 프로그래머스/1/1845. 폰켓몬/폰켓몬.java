import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // set
        HashMap<Integer, Integer> map = new HashMap<>();
        //int[nums.length / 2] mix = [0, 0];
        
        for ( int i = 0 ; i < nums.length ; i ++) {
            // 조합이 이미 n/2보다 커졌으면 리턴
            if ( answer >= ( nums.length / 2)) return answer;
            
            // 조합에 없으면 추가
            if ( !map.containsKey(nums[i]) ) {
                map.put(nums[i], 1);
                answer += 1;
            }
            
        }
        
        
        return answer;
    }
}