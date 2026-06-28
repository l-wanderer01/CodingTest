import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String AB = A + B;
        String BA = B + A;

        int ab = Integer.parseInt(AB);
        int ba = Integer.parseInt(BA);

        int sum = ab + ba;
        System.out.printf("%d", sum);
    }
}