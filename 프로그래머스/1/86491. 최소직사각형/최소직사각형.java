class Solution {
    public int solution(int[][] sizes) {

        int w = Math.max(sizes[0][0], sizes[0][1]);
        int h = Math.min(sizes[0][0], sizes[0][1]);
        // w, h 정하기, 다른 것과(최대) 비교해서 사이즈가 크면 패스 & 세로길이 셋팅
        for(int i = 1 ; i < sizes.length ; i ++) {
            // w, h , refactor
            // if(w < Math.max(sizes[i][0], sizes[i][1])) {
            //     w = Math.max(sizes[i][0], sizes[i][1]);
            // } 
            // if(h < Math.min(sizes[i][0], sizes[i][1])) {
            //     h = Math.min(sizes[i][0], sizes[i][1]);
            // }
            // refactoring
            w = Math.max(w, Math.max(sizes[i][0], sizes[i][1]));
            h = Math.max(h, Math.min(sizes[i][0], sizes[i][1]));
            
            
        }
        return w * h;
    }
}