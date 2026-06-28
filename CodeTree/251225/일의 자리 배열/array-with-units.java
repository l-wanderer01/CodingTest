import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(); // 첫 번째 항
        int n2 = sc.nextInt(); // 두 번째 항

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < 10; i++) {
            int tmp = n2 + n1;
            System.out.print((tmp % 10) + " ");
            n1 = n2; // n1에 이전의 n2 값
            n2 = tmp; // n2에 덧셈한 값
        }
    }
}