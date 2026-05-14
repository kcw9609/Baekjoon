import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
       
        // start
        Queue<Integer> que = new LinkedList<>();
        
        // que에 넣음
        // 시간마다 time ++, 왼쪽으로 한칸씩 옮기기
        // 자리있으면 넣고 아님 기다리기
        int index = 0; int time = 0; int curr_weight = 0;
        for(int i = 0 ; i < bridge_length ; i ++) {
            que.offer(0);
        }
        
        while(index < truck_weights.length) {
            time += 1;
            // 한 칸 이동
            curr_weight -= que.poll();
            
            // 넣기=한칸 움직이기
            if(curr_weight + truck_weights[index] <= weight) {
                curr_weight += truck_weights[index];
                que.offer(truck_weights[index]);
                index += 1;
            }
            // 나가기
            else {que.offer(0);} // 다른거 못 너으면 빈칸으로 셋팅해줌
         
        }
        // 다 올라가서 움직이는 시간만 더해줌
        return time + bridge_length;
    }
}