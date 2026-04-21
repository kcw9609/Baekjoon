import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        // set
        HashMap<String, Integer> map = new HashMap<>();
        
        // save - (category, 가짓수)
        for (int i = 0 ; i < clothes.length ; i ++) {
            if ( map.containsKey( clothes[i][1] )) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
                
            } else {
                map.put(clothes[i][1], 1);
            }
        }
        
        // mix - 
        for (int value : map.values()) {
            answer = answer * (value + 1);
        }
        return answer - 1;
    }
}