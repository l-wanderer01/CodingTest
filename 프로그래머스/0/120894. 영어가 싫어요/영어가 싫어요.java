class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] sArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < sArr.length; i++) {
            numbers = numbers.replace(sArr[i], String.valueOf(i));
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}