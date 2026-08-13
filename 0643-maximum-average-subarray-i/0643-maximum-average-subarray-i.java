class Solution {
    // 목표 : k 길이의 연속된 평균이 가장 큰 서브배열
    public static double findMaxAverage(int[] nums, int k) {		
		// 맨 처음 슬라이드 합
		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		
		// 총 요소 개수
		int len = nums.length;
        // 직전 조합의 합을 저장할 변수
		double tmp = sum;
		for (int i = 1; i <= len-k; i++) {
			// 앞을 빼고 뒤를 더한다.
			tmp = tmp - nums[i-1] + nums[i+k-1];
			// 그 후 대소를 비교한다.
			if (sum < tmp) {
				sum = tmp;
			}
		}
		
		// 평균은 마지막 한번만 계산
		return sum/k;
	}
}