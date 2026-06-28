class Solution {
    public int solution(String myString, String pat) {
        // 대문자로 통일
        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
    }
}