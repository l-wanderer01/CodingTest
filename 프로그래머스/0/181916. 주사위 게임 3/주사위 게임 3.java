import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];
        
        if (a != b && b != c && c != d) {
            answer += a;
        }
        else if (a == b && b == c && c == d) {
            answer += 1111 * a;
        }
        else if (a == b) {
            if (b == c) {
                answer += (10 * a + d) * (10 * a + d);
            }
            else { // b != c
                if (c == d) {
                    answer += (a + c) * Math.abs(a - c);
                }
                else { // c != d
                    // System.out.println("이거야?");
                    answer += c * d;
                }
            }
        }
        else { // a != b
            if (b == c) {
                if (c == d) {
                    answer += (10 * b + a) * (10 * b + a);
                }
                else { // c != d
                    answer += a * d;
                }
            }
            else { // b != c
                if (c == d) {
                    answer += a * b;
                }
            }
        }
        
        
        return answer;
    }
}