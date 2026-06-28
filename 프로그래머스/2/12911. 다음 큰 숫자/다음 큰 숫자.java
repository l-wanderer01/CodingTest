import java.lang.Integer;

class Solution {
    public int solution(int n) {
//         int answer = n;
        
//         int cnt = Integer.bitCount(n);
//         System.out.println(cnt);
        
//         while(true) {
//             answer++;
//             if (cnt == Integer.bitCount(answer)) {
//                 return answer;
//             }
//         }  
        
        String input = Integer.toBinaryString(n); // 이진수로 변환
        // 1의 개수 count
        String num1 = input.replace("0", "");
        int cnt = num1.length();
        
        int answer = n;
        
        while (true) {
            answer++;
            String s1 = Integer.toBinaryString(answer); // 이진수로 변환
            String s2 = s1.replace("0", ""); // 1의 개수 count
            int num = s2.length();
            if(cnt == num) { // 1의 개수가 동일한 경우 해당 값을 return
                return answer;
            }
        }
    }
}