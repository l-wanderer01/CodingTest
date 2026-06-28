class Solution {
    public int solution(int n, String control) {
        // charArray로 뜯기, 또는 split
        char[] cArr = control.toCharArray();
        // charAt으로 분리
        char curr = '\0';
        for (int i = 0; i < cArr.length; i++) {
            curr = cArr[i];
            if (curr == 'w') {
                n += 1;
            }
            else if (curr == 's') {
                n -= 1;
            }
            else if (curr == 'd') {
                n += 10;
            }
            else {
                n -= 10;
            }
        }
        
        return n;
    }
}