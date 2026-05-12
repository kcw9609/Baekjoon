import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        // set dp[i]
        Set<Integer>[] dp = new HashSet[9];
        // 초기화
        for(int i = 0 ; i <= 8 ; i ++) {
            dp[i] = new HashSet<Integer>();
        }
        dp[1].add(N);
        dp[2].add(N + N);dp[2].add(N - N);dp[2].add(N / N);dp[2].add(N * N);
        
         //  자기자신 55 삽입.
        int m = Integer.parseInt(String.valueOf(N).repeat(2));
        dp[2].add(m);
        
        // if 답이 1, 2인경우
        if(N == number) return 1;
        if(dp[2].contains(number)) return 2;
        
        
        for (int i = 3 ; i <= 8 ; i++ ) {

            // if i = 5: 1+4, 2+3
            // 이전 두 개 조합 계산
            for (int j = 1 ; j < i ; j ++) { // 
                for(int a : dp[j]) {
                    for (int b : dp[i - j]) {
                        // 사칙연산 , 나누기 예외처리, 정답나오면 반환
                        if(a + b == number || a - b == number || a * b == number ) {
                            answer = i; return answer;
                        }
                        dp[i].add(a + b);
                        dp[i].add(a - b);
                        dp[i].add(a * b);
                        
                        if(b!= 0) {
                             dp[i].add(a / b);
                            if(a/b == number) {answer = i; return answer;} 
                        }
                        
                    }
                }
            }

            //  자기자신 555 삽입.
            m = Integer.parseInt(String.valueOf(N).repeat(i));
            dp[i].add(m);
            if(m == number){answer = i; return answer;}
        }
        
      
        
        // 끝까지 없으면 -1 리턴
        answer = -1;
        
        return answer;
    }
  
}