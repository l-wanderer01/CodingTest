import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        String std = sc.next();

        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == std.charAt(0)) {
                cnt++;
                System.out.println(arr[i]);
            }
        }

        if (cnt == 0) System.out.print("None");
    }
}