import java.math.*;

class Solution {
    public String solution(String a, String b) {
        
//         Stack<Integer> stk = new Stack<>();
        
//         if (a.charAt(0) - '0' + b.charAt(0) - '0' >= 10) answer += "1";
        
//         int add = 0;
        
//         for (int i = a.length() - 1; i >= 0; i--) {
//             int sum = a.charAt(i) - '0' + b.charAt(i) - '0';
//             if (add == 1) sum += 1;
            
//             if (sum >= 10) {
//                 sum %= 10;
//                 add = 1;
//             }
            
//             else {
//                 add = 0;
//             }
            
//             // System.out.println(sum);
            
//             stk.push(sum);
            
//             System.out.println(sum);
//         }
        
//         // stk는 3개를 가지는데 왜 마지막 i가 사라질까
//         for (int i = 0; i <= stk.size(); i++) {
//             // System.out.println(i);
//             answer += stk.pop();
//             // System.out.println(answer);
//         }
        
        BigInteger bi1 = new BigInteger(a);
        BigInteger bi2 = new BigInteger(b);
        
        String answer = "" + bi1.add(bi2);
        
        return answer;
    }
}