import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ee = "No";
        String ab = "No";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') ee = "Yes";
            else if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') ab = "Yes";
        }

        System.out.printf("%s %s", ee, ab);
    }
}