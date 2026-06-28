class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] cArr = my_string.toCharArray();
        cArr[num1] = my_string.charAt(num2);
        cArr[num2] = my_string.charAt(num1);
        
        answer = String.valueOf(cArr);
        
        return answer;
    }
}