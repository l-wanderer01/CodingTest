import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;


class Solution {
    static int giTime;
    static int giFee;
    static int danTime;
    static int danFee;
    
    public int[] solution(int[] fees, String[] records) {
        
        giTime = fees[0];
        giFee = fees[1];
        danTime = fees[2];
        danFee = fees[3];
        // 입출차 관리 맵
        HashMap<String, String> map = new HashMap<>();
        // 차량별 누적 요금 관리
        TreeMap<Integer, Integer> carTime = new TreeMap<>();
        
        for (String r : records) {
            String[] record = r.split(" ");
            String time = record[0]; // 시각
            String car = record[1]; // 차량 번호
            String ny = record[2]; // 내역
            // 입차
            if (ny.equals("IN")) {
                map.put(car, time);
            }
            // 출차
            else {
                int totalTime = 0;
                // 입차했던 시간 가져옴. 동시에 해당 차량 삭제
                String icTime = map.remove(car);
                String[] ic = icTime.split(":"); // 입차시간
                String[] cc = record[0].split(":"); // 출차시간
                int min = Integer.parseInt(cc[1]) - Integer.parseInt(ic[1]);
                int hour = Integer.parseInt(cc[0]) - Integer.parseInt(ic[0]);
                if (min < 0) {
                    min = 60 + min;
                    hour -= 1;
                }
                // 누적 주차 시간
                totalTime = hour * 60 + min;
                // 차에 시간을 누적함 (차량이 처음 누적될 때 "getOrDefault"로 에러 방지)
                carTime.put(Integer.parseInt(car), carTime.getOrDefault(Integer.parseInt(car), 0) + totalTime);
            }
        }
                
        // 입차 후 출차하지 않은 차량 관리
        for (String carNum : map.keySet()) {
            int totalTime = 0;
            String icTime = map.get(carNum);
            String[] ic = icTime.split(":"); // 입차시간
            String[] cc = carNum.split(":"); // 출차시간
            int min = 59 - Integer.parseInt(ic[1]);
            int hour = 23 - Integer.parseInt(ic[0]);
            // 누적 주차 시간
            totalTime = hour * 60 + min;
            // 차량별 누적 요금 관리
            carTime.put(Integer.parseInt(carNum), carTime.getOrDefault(Integer.parseInt(carNum), 0) + totalTime);
        }
        
        int[] answer = new int[carTime.size()];
        int idx = 0;
        for (int time : carTime.values()) {
            answer[idx] = payFee(time);
            idx++;
        }
        
        return answer;
    }
    
    // 요금 계산
    public static int payFee (int time) {
        int totalFee = giFee;
        time -= giTime;
        if (time <= 0) return totalFee;
        
        if (time % danTime == 0) {
            totalFee += time/danTime*danFee;
        }
        else {
            totalFee += (time/danTime+1)*danFee;
        }
        return totalFee;
    }
}