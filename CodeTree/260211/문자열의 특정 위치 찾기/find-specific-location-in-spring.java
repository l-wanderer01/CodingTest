import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String std = sc.next();

        int idx = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == std.charAt(0)) {
                idx = i;
                break;
            }
        }

        if (idx >= 0) {
            System.out.printf("%d", idx);
        }
        else {
            System.out.print("No");
        }
    }
}