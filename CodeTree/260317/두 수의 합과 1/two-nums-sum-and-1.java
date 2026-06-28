import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A + B;

        String s = Integer.toString(sum);

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') cnt++;
        }

        System.out.printf("%d", cnt);
    }
}