class Solution {
    public int solution(String name) {
        int answer = 0;
        // set

        int move = name.length() - 1;
        
        // 왼ㅉ고 오른쪽 어디로 갈지 정하기
        for (int i = 0 ; i < name.length() ; i ++) {
            char c = name.charAt(i);
           
            // 위아래 결정 
            answer += Math.min(c - 'A' , 'Z' - c + 1);
            
            
            // move 계산
            // 앞으로 움직링 move vs 뒤로가서
            
            int next = i + 1;
            // 다음 A 찾아서 비교하기
            while(next < name.length() && name.charAt(next) == 'A') {
                next ++; 
            }
            
            // 좌우 이동 최소값 계산
            // i + i + n - next vs i + (next - i) + (n - next)
            move = Math.min(move, i + name.length() - next + Math.min(i, name.length() - next));
            
            
        }
        return answer + move;
        
        
    }
}