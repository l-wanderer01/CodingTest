class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] sArr = polynomial.split(" ");
        
        int x = 0, num = 0;
        
        for (int i = 0; i < sArr.length; i += 2) {
            if (sArr[i].contains("x")) {
                if (sArr[i].equals("x")) x += 1;
                else {
                    String tmp = sArr[i].substring(0, sArr[i].length() - 1);
                    x += Integer.parseInt(tmp);
                }
            }
            else num += Integer.parseInt(sArr[i]);
        }
        
        if (num == 0 && x == 0) answer = "0";
        else if (num == 0) answer = x == 1 ? "x" : x + "x";
        else if (x == 0) answer = num + "";
        else answer = x == 1 ? "x + " + num : x + "x + " + num; // x가 1이라면 생략
            
        return answer;
    }
}