import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 총 음악 개수
        int len = genres.length;
        Music[] musics = new Music[len];
        // 장르별 노래 개수 저장
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        
        // 장르 종류 저장
        for (int i = 0; i < len; i++) {
            set.add(genres[i]);
        }
        // 장르 개수 저장
        for (String genre : set) {
            map.put(genre, 0);
        }
        
        for (int i = 0; i < len; i++) {
            String genre = genres[i]; // 현재 인덱스의 장르
            musics[i] = new Music(genre, plays[i], i);
            map.put(genre, map.get(genre)+plays[i]);
        }
        
        // 
        
        // 3가지 정렬 기준에 맞춰서 정렬 (Comparable)
        Arrays.sort(musics, new Comparator<Music>() {
            @Override
            public int compare(Music a, Music b) {
                if (a.genre.equals(b.genre)) {
                    if (a.play == b.play) {
                        return a.idx - b.idx;
                    }
                    return b.play - a.play;
                }
                return map.get(b.genre).compareTo(map.get(a.genre));
            }
        });
        
        List<Integer> answer = new ArrayList<>();
        
        String genre = "";
        for (int i = 0, cnt = 0; i < musics.length; i++) {
            if (genre.equals(musics[i].genre)) {
                if (cnt == 2) {
                    continue;
                }
                else {
                    cnt++;
                    answer.add(musics[i].idx);
                }
            }
            else {
                cnt = 1;
                genre = musics[i].genre;
                answer.add(musics[i].idx);
            }
        }
        
        int[] arr = new int[answer.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = answer.get(i);
        }
        return arr;
    }
    public static class Music {
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
}

// 알고리즘 
// 자료구조 : Class와 Array 사용하면 풀리나
// 조건 
// Class를 먼저 정렬한다. 그 후 노래별 재생횟수로 정렬한다.