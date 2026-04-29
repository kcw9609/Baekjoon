class Solution {

    public int solution(int[][] signals) {
        int time = 1;
        int[] colors = new int[signals.length];


        // 충분한 시간까지 탐색
        while(time <= 50000000) {
            // 현재 색 계산
            for (int i = 0; i < signals.length; i++) {
                int cycle = signals[i][0] + signals[i][1] + signals[i][2];

                // 시간은 1초부터 시작
                int now = (time - 1) % cycle;

                colors[i] = iswhatcolor(signals, i, now);
            }
            
            // 모두 같은 색인지 확인
            int k;
            for (k = 0; k < colors.length - 1; k++) {
                if (colors[k] != colors[k + 1]) break;
            }

            // 전부 노란불인지 확인
            if (k == colors.length - 1 && colors[0] == 1) {
                return time;
            }
            time ++;

        }
         return -1;
       
    }
    
    public int iswhatcolor(int[][] signals, int signal, int sum) {

        int green = signals[signal][0];
        int yellow = signals[signal][1];
        int red = signals[signal][2];


        if (sum < green) return 0;
        else if (sum < green + yellow) return 1;
        return 2;
    }
}