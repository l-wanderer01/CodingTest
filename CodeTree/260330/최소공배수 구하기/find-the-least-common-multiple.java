import java.util.Scanner;

public class Main {
    // 최대공약수(GCD)를 구하는 메서드
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 두 숫자를 인자로 받아 최소공배수(LCM)를 구해 출력하는 메서드
    public static void printLCM(int n, int m) {
        // n * m 과정에서 int 범위를 넘을 수 있으므로 long 타입을 사용하는 것이 안전합니다.
        long lcm = (long) n * m / getGCD(n, m);
        System.out.println(lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n과 m 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 최소공배수 출력 함수 호출
        printLCM(n, m);

        sc.close();
    }
}