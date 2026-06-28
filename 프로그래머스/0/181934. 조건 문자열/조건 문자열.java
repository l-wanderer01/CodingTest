class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        // // 4가지 경우로 나누어 찢는다.
        // if (ineq.equals(">")) {
        //     if (eq.equals("=")) {
        //         answer = n >= m ? 1 : 0;
        //     }
        //     else {
        //         answer = n > m ? 1 : 0;
        //     }
        // }
        // else {
        //     if (eq.equals("=")) {
        //         answer = n <= m ? 1 : 0;
        //     }
        //     else {
        //         answer = n < m ? 1 : 0;
        //     }
        // }
        
        answer = ((ineq.equals(">") ? n > m : n < m) || (eq.equals("=") ? n == m : false)) ? 1 : 0;
        
        return answer;
    }
}