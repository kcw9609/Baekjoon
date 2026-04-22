class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        
        // dfs
        
        dfs(0, 0, numbers, target);
        
        return answer;
    }
    
    public void dfs(int index, int current, int[] numbers, int target) {
            // exception - 도달하면
            if ( index == numbers.length ){
                if ( current == target) answer += 1;
                return;
            } 
            
            // 빼기, 더하기
            dfs(index + 1 , current + numbers[index], numbers, target);
            dfs(index + 1 , current - numbers[index], numbers, target);

        }
}