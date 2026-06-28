import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        
        if (myString.endsWith("x")) {
            myString += "\0";
        }
        
        String[] strList = myString.split("x");
        int[] answer = new int[strList.length];
        
        for (int i = 0; i < strList.length; i++) {
            answer[i] = strList[i].length();
        }
        
        if (myString.endsWith("\0")) {
            answer[answer.length - 1] -= 1;
        }
        
        return answer;
    }
}