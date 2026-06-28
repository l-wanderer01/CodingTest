class Solution {
    public String solution(String n_str) {
        int i = 0;
        while(n_str.charAt(i) == '0') {
            i++;
        }
        
        return n_str.substring(i, n_str.length());
    }
}