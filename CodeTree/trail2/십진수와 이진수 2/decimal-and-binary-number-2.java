import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        int num = Integer.parseInt(binary, 2);
        num *= 17;
        String binary17 = Integer.toString(num, 2);
        System.out.println(binary17);
    }
}

// 이진수 -> 10진수 17배 -> 이진수

// 이진수 -> 10진수
// Integer.parseInt(binary, 2);
// Integer.toString(num, 2);