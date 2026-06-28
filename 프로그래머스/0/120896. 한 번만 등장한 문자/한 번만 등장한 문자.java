import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] cArr = s.toCharArray();
        boolean[] bArr = new boolean[cArr.length];
        Arrays.fill(bArr, true); // bArr에 모두 true로 채워 넣음
        Arrays.sort(cArr);
        
        for (int i = 0; i < cArr.length; i++) {
            for (int j = 0; j < cArr.length; j++) {
                if (cArr[i] == cArr[j] && i != j) {
                    bArr[i] = false;
                    break;
                }
            }
            if (bArr[i]) answer += cArr[i];
        }
        
        return answer;
    }
}