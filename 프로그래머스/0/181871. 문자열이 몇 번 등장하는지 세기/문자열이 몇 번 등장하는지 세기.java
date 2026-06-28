class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == pat.charAt(0) && i + pat.length() <= myString.length()) {
                for (int j = 0; j < pat.length(); j++) {
                    if (myString.charAt(i + j) != pat.charAt(j)) break;
                    else if (myString.charAt(i + j) == pat.charAt(j) && j == pat.length() - 1) answer++;
                }
            }
        }
        
        return answer;
    }
}