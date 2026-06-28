import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = minimum(a, b, c);

        System.out.printf("%d", result);
    }

    private static int minimum(int a, int b, int c) {
        int result = Math.min(a, b);

        result = Math.min(result, c);
        return result;
    }
}