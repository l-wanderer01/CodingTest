import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = sc.nextInt();

        int s_num = s.charAt(0);

        System.out.printf("%d %s", s_num, (char)n + "");
    }
}