import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        while (true) {
            
            int idx = A.indexOf(B);

            if (idx == -1) {
                break;
            }

            A = A.substring(0, idx) + A.substring(idx + B.length());
        }

        System.out.printf("%s", A);
    }
}