import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        
        int p = A.charAt(0) + B.charAt(0);
        int m = Math.abs(A.charAt(0) - B.charAt(0));

        System.out.printf("%d %d", p, m);
    }
}