import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        String M = sc.nextLine();

        sc.close();

        int res = isSubstring(N, M);

        System.out.printf("%d", res);
    }

    private static int isSubstring(String a, String b) {
        int idx = a.indexOf(b);
        return idx;
    }
}