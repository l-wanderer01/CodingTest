import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = "";

        for (int i = 0; i < N; i++) {
            str += sc.next();
        }

        for (int i = 0; i < str.length(); i += 5) {
            for (int j = i; j < i + 5; j++) {
                if (j >= str.length()) break;
                System.out.printf("%c", str.charAt(j));
            }
            System.out.println();
        }
    }
}