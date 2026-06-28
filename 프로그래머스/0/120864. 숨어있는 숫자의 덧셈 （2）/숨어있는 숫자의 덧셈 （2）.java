class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] sArr = my_string.split("[a-z]|[A-Z]");
        
        for (String s : sArr) {
            if (!s.equals("")) answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}