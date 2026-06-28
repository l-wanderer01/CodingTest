import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();

            if (s.equals("END")) {
                break;
            }

            s = new StringBuilder(s).reverse().toString();

            System.out.println(s);
        }
    }
}