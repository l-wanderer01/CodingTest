import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        String res = "";

        if (isPalindrome(A)) res = "Yes";
        else res = "No";

        System.out.printf("%s", res);
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }
        return true;
    }
}