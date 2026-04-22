import java.util.Queue;
import java.util.LinkedList;
class Solution {
    int answer = 0;
    public int solution(int n, int[][] computers) {
        
        // set
        int[] visit = new int[n];
        
        
        // bfs roof
        for ( int i = 0; i < n ; i ++) {
            if (visit[i] == 0) { // 방문 x곳 돌기
                //초기화
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                visit[i] = 1;
                
                bfs(i, n, computers, queue, visit); 
                answer += 1;
            }
        }
        return answer;
    }
    public void bfs(int index, int n, int[][] computers, Queue<Integer> queue, int[] visit) {
        
        // 큐에서 꺼내서 방문
        while (!queue.isEmpty()) {  // 예외처리 - 큐가 끝나면 나가기
            
            // 꺼내고 연결된거 넣기
            int q = queue.poll();
       
            // 다음방문지 삽입
            // 자기자신 방지, 방문이력조회, 넣을떄 방문처리
            for (int i = 0 ; i < computers[q].length ; i ++) {
                if (q != i && visit[i] == 0 && computers[q][i] == 1) {
                    queue.offer(i);
                    visit[i] = 1;
                }
                
            }
            
        }

    }
}