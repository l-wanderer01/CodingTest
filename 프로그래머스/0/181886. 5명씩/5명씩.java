class Solution {
    public String[] solution(String[] names) {
        String[] answer = names.length % 5 == 0 ? new String[names.length / 5] : new String[names.length / 5 + 1];
        
        for(int i = 0, idx = 0; i < names.length; i += 5) {
            answer[idx++] = names[i];
        }
        
        return answer;
    }
}