class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n + 1];
        // 상태 저장하기
        for(int l : lost) student[l] --;
        for (int r : reserve) student[r] ++ ;
        
        // 빌려주기
        for (int i = 1 ; i <= n ; i ++) {
            // 앞사람 맞음
            if (student[i] == -1) {
                if (i > 1 && student[i - 1] == 1 ) {
                    student[i] ++ ; student[i - 1] --;
                } 
                else if (i < n && student[i + 1] == 1) {
                    student[i] ++ ; student[i + 1] --;
                }
            }
           
        }
        // 계산하기 - students에서 -1인 사람 계산해서 빼기
        for (int s : student) {
            if (s == -1) answer -= 1;
        }
        answer += n;
        
        return answer;
    }
}