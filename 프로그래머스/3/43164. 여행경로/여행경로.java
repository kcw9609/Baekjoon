import java.util.*;
class Solution {
    String[] answer = {};
    public String[] solution(String[][] tickets) {
        
        // set
        List<String> path = new ArrayList<>();
        int[] visit = new int[tickets.length];
        int temp;
        // sort
        Arrays.sort(tickets, (a, b) -> {
            if(a[0].equals(b[0])) return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        });
        path.add("ICN");
        dfs("ICN", path, tickets, visit, 0);
         
        return answer;
    }
    public boolean dfs(String curr, List<String> path, String[][] tickets, int[] visit, int count) {
        // exception - 모든 것을 방문 -> 끝'
        if (count == tickets.length) {
            answer = path.toArray(new String[0]);
            return true;
        }
        
        // 돌다가 같은 것 찾으면 방문
        for (int i = 0 ; i < tickets.length ; i ++) {
            // 같으면 방문, 연결
            if (curr.equals(tickets[i][0]) && (visit[i] == 0 )) {
                path.add(tickets[i][1]);
                visit[i] = 1;
                // 다음거 계속 가서 다 찾으면 끝
                if(dfs(tickets[i][1], path, tickets, visit, count + 1)) {
                    return true;
                }
                // 백트래킹 - 위의 if 문에서 못 끝나면
                visit[i] = 0;
                path.remove(path.size() - 1);
                
            }
        }
        return false;
        
    }
}















