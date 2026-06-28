class Solution {
    public String solution(int[] numLog) {
        int diff = 0;
        char[] answer = new char[numLog.length - 1];
        
        for (int i = 1; i < numLog.length; i++) {
            diff = numLog[i] - numLog[i-1];
            switch(diff) {
                case 1 :
                    answer[i-1] = 'w';
                    break;
                case -1 :
                    answer[i-1] = 's';
                    break;
                case 10 :
                    answer[i-1] = 'd';
                    break;
                case -10:
                    answer[i-1] = 'a';
                    break;
                default :
                    answer[i-1] = '\0';
                    break;
            }
        }
        
        // char[] -> String
        return String.valueOf(answer);
    }
}