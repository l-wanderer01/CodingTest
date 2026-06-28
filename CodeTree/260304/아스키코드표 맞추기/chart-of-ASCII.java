import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            char c = (char)num;

            str += c + " ";
        }

        System.out.println(str);
    }
}