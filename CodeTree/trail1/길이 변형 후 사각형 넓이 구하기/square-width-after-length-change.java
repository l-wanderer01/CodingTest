import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt() + 8;
        int c = sc.nextInt() * 3;
        int width = r * c;

        System.out.println(r);
        System.out.println(c);
        System.out.println(width);
    }
}