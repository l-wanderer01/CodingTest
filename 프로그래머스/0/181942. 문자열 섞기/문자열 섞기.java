class Solution {
    public String solution(String str1, String str2) {
        // 풀이 1
//         char[] cArr1 = str1.toCharArray();
//         char[] cArr2 = str2.toCharArray();
        
//         char[] result = new char[str1.length() + str2.length()];
        
//         for (int i = 0; i < cArr1.length; i++) {
//             result[2*i] = cArr1[i];
//             result[2*i + 1] = cArr2[i];
//         }
        
//         String answer = String.valueOf(result);
        
        // 풀이 2
        String answer = "";
        
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        
        return answer;
    }
}