import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수
        int b = sc.nextInt(); // 진수
        StringBuilder sb = new StringBuilder(); 
        while (n>0) {
            int remain = n%b;
            sb.append(remain);
            n/=b;
        }
        
        System.out.println(sb.reverse().toString());
    }
}

// 4진수 -> 10진수
// 4진수면 num = num * 4 + num.charAt()
// 10진수를 n진수로

// 입력 받음
// int jinsu = N;
// while(num > 0) {
//     int remain = 나머지 값을 누적
//     sb.append(remain)
//     num/=N
// }