import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        String res = isExist(M, D);

        System.out.printf("%s", res);
    }

    private static String isExist(int M, int D) {
        if (M > 12 || D > 31) return "No";

        if (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) {
            if (D <= 31) return "Yes";
        }
        else {
            if (M == 2) {
                if (D <= 28) return "Yes";
            }
            else {
                if (D <= 30) return "Yes";
            }
        }

        return "No";
    }
}