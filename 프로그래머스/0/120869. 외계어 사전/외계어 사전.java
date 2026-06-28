class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        boolean[] bArr = new boolean[dic.length];
        
        for (int i = 0; i < dic.length; i++) {
            for (String s : spell) {
                if (dic[i].contains(s)) bArr[i] = true;
                else {
                    bArr[i] = false;
                    break;
                }
            }
            if (bArr[i]) answer = 1;
        }
        
        return answer;
    }
}