class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] sArr = quiz[i].split(" ");
            int result = 0;
            if (sArr[1].equals("+")) {
                result = Integer.valueOf(sArr[0]) + Integer.valueOf(sArr[2]);
            }
            else {
                result = Integer.valueOf(sArr[0]) - Integer.valueOf(sArr[2]);
            }
    
            answer[i] = result == Integer.valueOf(sArr[4]) ? "O" : "X";
        }
        
        return answer;
    }
}