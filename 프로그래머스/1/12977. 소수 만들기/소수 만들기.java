class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    // System.out.println(i + " " + j + " " + k);
                    boolean tf = true;
                    for (int num = 2; num <= Math.sqrt(sum); num++) {
                        if (sum % num == 0) {
                            tf = false;
                            break;
                        }
                    }
                    if (tf) answer++;
                }
            }
        }

        return answer;
    }
}