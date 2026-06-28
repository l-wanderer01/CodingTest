class Solution {
    public String solution(int q, int r, String code) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(code.charAt(i));
            }
        }
        // 이 방법도 가능
        // for (int i = r; i < code.length(); i += q) {
        //     sb.append(code.charAt(i));
        // }
        
        return sb.toString();
    }
}