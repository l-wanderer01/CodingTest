class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int lastIdx = num_list.length - 1;
        int append = 0;
        if (num_list[lastIdx] > num_list[lastIdx - 1]) {
            append = num_list[lastIdx] - num_list[lastIdx - 1];
        }
        else {
            append = num_list[lastIdx] * 2;
        }
        
        // int[]를 int[]로 어떻게 복제하냐... for문...
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[lastIdx + 1] = append;
        
        return answer;
    }
}