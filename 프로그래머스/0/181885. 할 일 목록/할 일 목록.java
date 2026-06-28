class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 결과 배열의 전체 길이!
        int idx = 0;
        for(int i = 0; i < finished.length; i++) {
            if (!finished[i]) idx++;
        }
        String[] answer = new String[idx];
        
        for(int i = 0, j = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[j++] = todo_list[i];
            }
        }
        return answer;
    }
}