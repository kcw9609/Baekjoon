class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        for (int i = 1; i < triangle.length; i ++) {
            for (int j = 0 ; j < triangle[i].length ; j ++) {
                // 왼쪽
                if(j == 0) {
                    triangle[i][j] += triangle[i - 1][0];
                }
                // 오른쪽
                else if (j == triangle[i].length - 1) {
                    triangle[i][j] += triangle[i - 1][triangle[i - 1].length - 1];
                }
                // 가운데 확인
                else {
                    // 왼 오 비교
                    triangle[i][j] += Math.max(triangle[i - 1][j - 1] , triangle[i - 1][j]);
                }
            }
            
           
        }
        
        // 마지막 노드의 최대값 비교
        
        for(int i = 0 ; i < triangle[triangle.length - 1].length ; i ++) {
            int node = triangle[triangle.length - 1][i];
            if(node > answer) answer = node;
            
        }
        return answer;
    }
}