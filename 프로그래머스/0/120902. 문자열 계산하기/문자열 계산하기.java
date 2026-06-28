class Solution {
    public int solution(String my_string) {
        
        String[] sArr = my_string.split(" ");
        int answer = Integer.valueOf(sArr[0]);
        
        for (int i = 1; i < sArr.length - 1; i += 2) {
            if (sArr[i].equals("+")) {
                answer += Integer.valueOf(sArr[i + 1]);
            }
            else if (sArr[i].equals("-")) {
                answer -= Integer.valueOf(sArr[i + 1]);
            }
            else {
                continue;
            }
        }
        
        return answer;
    }
}