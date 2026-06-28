import java.util.*;

class Solution {
    class Stage implements Comparable<Stage> {
        int id; // 스테이지 번호
        double rate; // 실패율
        
        public Stage(int id, double rate) {
            this.id = id;
            this.rate = rate;
        }
        
        // 정렬 기준
        @Override
        public int compareTo(Stage tmp) {
            // 실패율이 같은 경우, 스테이지 번호 순 정렬 (오름차순)
            if (this.rate == tmp.rate) {
                return Integer.compare(this.id, tmp.id);
            }
            // 실패율이 다른 경우 (내림차순)
            return Double.compare(tmp.rate, this.rate);
        }
    }
    
    public int[] solution(int N, int[] stages) {
        // 실패율: 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        // N: 전체 스테이지 수, stages: 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
        
        // 1. 스테이지별 멈춘 사용자 수
        int[] playingStage = new int[N + 2]; // N번째 스테이지를 깨고 그 다음 스테이지를 올라간 사용자도 있기 때문에 N+2
        for (int stage : stages) {
            playingStage[stage]++;
        }
        
        List<Stage> al = new ArrayList<>();
        double totalPlayer = stages.length; // 전체 플레이어 수
        
        // 실패율 계산
        for (int i = 1; i <= N; i++) {
            double failRate = 0.0; // 실패율 저장
            // 분모가 0이 아닐 때만 계산
            if (totalPlayer != 0) {
                failRate = (double) playingStage[i] / totalPlayer;
            }
            
            al.add(new Stage(i, failRate));
            
            // 다음 스테이지로 넘어가기 전, 현재 스테이지에 멈춘 사람의 수를 뺌
            totalPlayer -= playingStage[i];
        }
        
        // 실패율 기준 정렬
        Collections.sort(al);
        
        // 결과 반환
        int[] answer = new int[N];
        
        for (int i = 0; i < N; i++) {
            answer[i] = al.get(i).id;    
        }
        
        return answer;
    }
}