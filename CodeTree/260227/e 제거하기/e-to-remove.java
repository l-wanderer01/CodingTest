import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int idx = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                idx = i;
                break;
            }
        }

        str = str.substring(0, idx) + str.substring(idx + 1);

        System.out.println(str);
    }
}