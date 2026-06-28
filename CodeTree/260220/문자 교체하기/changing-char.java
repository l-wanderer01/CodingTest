import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String answer = A.substring(0, 2) + B.substring(2); // == B.substring(2, B.length())
        System.out.println(answer);
    }
}