import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        int len = A.length();
        int answer = -1;

        for (int shift = 1; shift <= len; shift++) {
            String tmp = A.substring(len - shift) + A.substring(0, len - shift);

            if (tmp.equals(B)) {
                answer = shift;
                break;
            }
        }

        System.out.printf("%d", answer);
    }
}