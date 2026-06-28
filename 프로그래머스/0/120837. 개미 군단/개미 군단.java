class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int king = hp / 5;
        hp %= 5;
        int solder = hp / 3;
        hp %= 3;
        int worker = hp / 1;
        hp %= 1;       
        
        answer = king + solder + worker;
        
        return answer;
    }
}