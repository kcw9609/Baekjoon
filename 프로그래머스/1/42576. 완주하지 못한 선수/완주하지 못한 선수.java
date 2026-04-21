import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 참가자 해시 맵 구축(이름, 명수)
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i < participant.length ; i ++) {
            if (map.containsKey(participant[i])) { // 이미 들어있음
                map.put(participant[i], map.get(participant[i]) + 1);
            }
            else {
                map.put(participant[i], 1);
            }
                
        }
        
        
        // 완주자 하나씩 제거
        for (int i = 0 ; i < completion.length ; i ++) {
            // 들어있으면 제거
            if (map.containsKey(completion[i])) { // 음수 허용
                map.put(completion[i], map.get(completion[i]) - 1);
                
            }
        }
        
        // value가 1인 것 반환
        for (int i = 0 ; i < participant.length ; i ++) {
            if (map.get(participant[i]) >= 1) {
                answer = participant[i];
                break;
                                  
            }
            
        }
            
        
        return answer;
    }
}