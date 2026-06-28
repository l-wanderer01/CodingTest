import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();

        int numA = extractInteger(strA);
        int numB = extractInteger(strB);

        int sum = numA + numB;
        System.out.printf("%d", sum);
    }

    private static int extractInteger(String str) {
        int idx = 0;
        int len = str.length();

        while(idx < len && Character.isDigit(str.charAt(idx))) {
            idx++;
        }

        if (idx == 0) return 0; // 모두 숫자가 아니라면 예외처리

        return Integer.parseInt(str.substring(0, idx));
    }
}