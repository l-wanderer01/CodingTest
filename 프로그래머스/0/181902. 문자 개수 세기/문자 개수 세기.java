class Solution {
    public int[] solution(String my_string) {
        int num1 = 'Z' - 'A' + 1;
        int num2 = 'z' - 'a' + 1;
        int[] answer = new int[num1 + num2];
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) <= 'Z') {
                answer[my_string.charAt(i) - 'A'] += 1;   
            }
            else {
                answer[my_string.charAt(i) - 'a' + num1] += 1;
            }
        }
        return answer;
    }
}