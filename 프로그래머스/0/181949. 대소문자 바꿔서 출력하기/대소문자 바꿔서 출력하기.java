import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String answer = "";
        
        for (int i = 0; i < a.length(); i++) {
            
            char c = a.charAt(i);
            char ch = '\0'; // char 초기화

            // ASCII 변환 or large로 변환
            if ((int)c >= 65 && (int)c <= 90) {
                ch = Character.toLowerCase(c);
            }
            else {
                ch = Character.toUpperCase(c);
            }
            
            answer += ch;
        }
        
        System.out.println(answer);
    }
}