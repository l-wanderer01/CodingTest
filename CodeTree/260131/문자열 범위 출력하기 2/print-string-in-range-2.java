import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int N = sc.nextInt();

        N = N < str.length() ? str.length() - N: 0;

        for (int i = str.length() - 1; i >= N;  i--) {
            System.out.printf("%c", str.charAt(i));
        }
    }
}