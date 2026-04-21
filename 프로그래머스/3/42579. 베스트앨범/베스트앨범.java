import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        // set
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, List<int[]>> songs = new HashMap<>();
        
        
        // save
        for (int i = 0; i < genres.length ; i ++) {
            if(map.containsKey(genres[i])) { // 이미 존재하면 +
                map.put(genres[i], map.get(genres[i]) + plays[i]);
                    
            } else { // 처믕 넣는거
                map.put(genres[i], plays[i]);
            }
            // 노래 넣기
            songs.putIfAbsent(genres[i], new ArrayList<>());
            songs.get(genres[i]).add(new int[]{i, plays[i]});
        }
        // 장르표만들기
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        int index = 0;
        
        // sort
            Collections.sort(list, (a, b) -> (
                map.get(b) - map.get(a)
            ));
        
        // 결과 저장
        List<Integer> result = new ArrayList<>();
        // 정렬된 장르별 곡 선정하기
        for (String genre : list) {
            List<int[]> song_list = songs.get(genre);
            
            Collections.sort(song_list, (a, b) -> {
                if (a[1] != b[1]) return b[1] - a[1];
                else return a[0] - b[0];
            });
            // 두개 선택
            result.add(song_list.get(0)[0]);
            if(song_list.size() > 1) result.add(song_list.get(1)[0]);

        }
        // 배열 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size() ; i ++) {
            answer[i] = result.get(i);
        }
        
              
        return answer;
    }
}