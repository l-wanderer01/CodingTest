class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 1. 차이 배열 생성
    int[] diff = new int[arr.length + 1];

    // 2. 각 쿼리를 차이 배열에 반영
    for(int[] query : queries) {
        int s = query[0], e = query[1];
        diff[s] += 1;
        if (e + 1 < diff.length) {
            diff[e + 1] -= 1;
        }
    }

    // 3. 누적합을 통해 원래 배열에 적용
    int add = 0;
    for(int i = 0; i < arr.length; i++) {
        add += diff[i];
        arr[i] += add;
    }

    return arr;
    }
}