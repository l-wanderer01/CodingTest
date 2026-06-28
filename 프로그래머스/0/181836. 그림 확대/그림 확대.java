class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k]; // 최종 배열의 초기 값
        
        for (int i = 0; i < picture.length; i++) {
            String tmp = "";
            for (int j = 0; j < picture[i].length(); j++) {
                String cTos = "" + picture[i].charAt(j);
                tmp += cTos.repeat(k); // picture[i]의 각 String을 반복
            }
            
            for (int l = 0; l < k; l++) { // row 반복
                answer[i * k + l] = tmp;
            }
        }
        
        return answer;
    }
}