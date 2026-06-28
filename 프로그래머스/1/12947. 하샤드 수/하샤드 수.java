class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        
        String[] arr = str.split("");
        
        int sum = 0;
        
        // 각 자리수의 값을 더함
        for (String s : arr) {
            sum += Integer.valueOf(s);
        }
        
        if (x % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}