import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        // student1 1 2 3 4 5 
        // st2 2 1 2 3 2 4 2 5 2 1 
        // st3 33 11 22 44 55
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // 비교
        int a1 = 0; int a2 = 0; int a3 = 0;
       
       for(int i = 0 ; i < answers.length ; i ++) {
           if (answers[i] == st1[i % st1.length]) a1++;
           if (answers[i] == st2[i % st2.length]) a2++;
           if (answers[i] == st3[i % st3.length]) a3++;
       }
        
        // final
        int temp =Math.max(a1, Math.max(a2, a3));
        
        List<Integer> li = new ArrayList<Integer>();
        if(a1 == temp) li.add(1);
        if(a2 == temp) li.add(2);
        if(a3 == temp) li.add(3);
        
        int[] answer = new int[li.size()];
        for(int i = 0 ; i < li.size() ; i ++) {
            answer[i] = li.get(i);
        }
        
    
        return answer;
    }
}