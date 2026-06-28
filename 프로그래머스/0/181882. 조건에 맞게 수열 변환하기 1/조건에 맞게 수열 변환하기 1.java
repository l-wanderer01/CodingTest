class Solution {
    public int[] solution(int[] arr) {
        int idx = 0;
        for(int num : arr) {
            if (num >= 50 && num % 2 == 0) arr[idx] = num / 2;
            else if (num < 50 && num % 2 == 1) arr[idx] = num * 2;
            idx++;
        }
        return arr;
    }
}