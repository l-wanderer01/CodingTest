class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        if (c.length % 2 == 0) {
            int index = c.length / 2;
            answer = String.valueOf(c[index - 1]) + String.valueOf(c[index]);
        }
        else {
            answer = String.valueOf(c[c.length / 2]);
        }
        // return c.length % 2 == 0 ? c[index] + c[index + 1] : c[c.length / 2];
        return answer;
    }
}