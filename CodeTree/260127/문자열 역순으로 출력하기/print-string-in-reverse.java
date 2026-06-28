import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[4];

        for (int i = 0; i < 4; i++) {
            String str = sc.next();
            strArr[i] = str;
        }

        for (int i = 3; i >= 0; i--) {
            System.out.println(strArr[i]);
        }
    }
}