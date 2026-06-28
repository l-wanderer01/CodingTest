import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next(); // 문자열을 받음
        
        int n = sc.nextInt(); // int를 입력 받음
        
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}