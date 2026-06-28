import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.printf("%s\n", s);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            s = s.substring(len - 1) + s.substring(0, len - 1);
            System.out.printf("%s\n", s);
        }
    }
}