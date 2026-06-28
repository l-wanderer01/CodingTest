class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sArr = s.split(" ");
        
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].equals("Z")|| (i + 1 < sArr.length) && sArr[i + 1].equals("Z")) {
                continue; // 현재의 요소가 Z이거나, 다음 요소의 인덱스가 배열 길이보다 작고 Z 값이라면 skip
            }
            else {
                answer += Integer.valueOf(sArr[i]);
            }
        }
        
        return answer;
    }
}