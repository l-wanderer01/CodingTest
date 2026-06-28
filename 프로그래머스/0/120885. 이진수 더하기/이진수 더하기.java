class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        int b1Length = bin1.length();
        int b2Length = bin2.length();
        
        String s1 = "";
        String s2 = "";
        
        if (b1Length != b2Length) {
            if (b1Length < b2Length) {
                for (int i = 0; i < b2Length - b1Length; i++) {
                    s1 += "0";
                }
            }
            else {
                for (int i = 0; i < b1Length - b2Length; i++) {
                    s2 += "0";
                }
            }
        }
        
        s1 += bin1;
        s2 += bin2;
        
        System.out.println(s1);
        System.out.println(s2);
        
        int tmp = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            int result = tmp + s1.charAt(i) - '0' + s2.charAt(i) - '0';
            String s = "";
            if (result >= 2) {
                tmp = 1;
                int num = result % 2;
                s = num + "";
            }
            else {
                tmp = 0;
                s = result + "";
            }
            sb.append(s);
        }
        
        String s = sb.toString();
        if (tmp == 1) {
            s += "1";
        }
        
        for (int i = s.length() - 1; i >= 0; i--) {
            answer += s.charAt(i);
        }
        
        return answer;
    }
}