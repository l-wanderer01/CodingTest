class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] date = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int day = 0;
        
        if (a == 1) {
            day = 5;
        }
        else if (a == 2) { // 29일까지 있음
            day = 1;
        }
        else if (a == 3) {
            day = 2;
        }
        else if (a == 4) {
            day = 5;
        }
        else if (a == 5) {
            day = 0;
        }
        else if (a == 6) {
            day = 3;
        }
        else if (a == 7) {
            day = 5;
        }
        else if (a == 8) {
            day = 1;
        }
        else if (a == 9) {
            day = 4;
        }
        else if (a == 10) {
            day = 6;
        }
        else if (a == 11) {
            day = 2;
        }
        else if (a == 12) {
            day = 4;
        }
        
        int idx = (b + day) % 7 - 1;
        if (idx == -1) idx = 6;
        answer = date[idx];
        
        return answer;
    }
}