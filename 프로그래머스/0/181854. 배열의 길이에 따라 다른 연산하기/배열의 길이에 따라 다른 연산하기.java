class Solution {
    public int[] solution(int[] arr, int n) {
        int num = arr.length % 2 == 0 ? 2 : 1;
        
        for (int i = num - 1; i < arr.length; i += 2) {
            arr[i] += n;
        }
        
        return arr;
    }
}