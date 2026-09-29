import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        // 풀이 1
        // int num = Integer.parseInt(binary, 2);
        // num *= 17;
        // String binary17 = Integer.toString(num, 2);
        // System.out.println(binary17);

        // 풀이 2
        // 이진수 -> 10진수
        int num = 0;
        for (int i = 0; i < binary.length(); i++) {
            num = 2*num + binary.charAt(i)-'0';
        }

        // 10진수 곱하기 17
        num *= 17;
        // System.out.println(Integer.toBinaryString(num)); // 이렇게 하면 바로 이진수 뽑아낼 수 있음

        StringBuilder sb = new StringBuilder();
        // 10진수 -> 이진수
        while(num > 0) {
            int remain = num % 2;
            sb.append(remain);
            num /= 2;
        }

        System.out.println(sb.reverse().toString());
    }
}

// 이진수 -> 10진수 17배 -> 이진수

// 이진수 -> 10진수
// Integer.parseInt(binary, 2);
// Integer.toString(num, 2);