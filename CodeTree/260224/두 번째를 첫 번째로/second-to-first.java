import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String A = str.charAt(1) + "";
        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            String tmp = str.charAt(i) + "";
            if (tmp.equals(A)) {
                arr[i] = arr[0];
            }
        }

        str = String.valueOf(arr);
        System.out.println(str);
    }
}