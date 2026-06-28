class Solution {
    public String solution(String my_string, int n) {
        String[] sarr = my_string.split("");
        return my_string.substring(sarr.length - n, sarr.length);
    }
}