import java.util.HashMap;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        // set
        HashMap<String, Boolean> map = new HashMap<>();
        
        // 저장
        for (String phone : phone_book) {
            map.put(phone, true);
        }
        
        for (int i = 0; i < phone_book.length ; i ++) {
            String phone = phone_book[i];
            // 꺼내서 prefix 계산
            for ( int j = 0 ; j < phone.length() ; j ++) {
                String prefix = phone.substring(0, j);
                // 있는지 확인
                if ( map.containsKey(prefix) ) return false; // 있음
            }
            
        }
            
            
        
        // 접두어 있으면 False / 없으명 True
        return answer;
    }
}