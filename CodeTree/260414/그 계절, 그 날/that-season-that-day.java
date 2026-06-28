import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        // 월별 일자 판단
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isYoonNyeon(Y)) month[2] = 29;
        
        String res = "";
        if (D > month[M]) res = "-1";
        else {
            res = decideSeason(M);
        }

        System.out.printf("%s", res);

        sc.close();
    }

    // 윤년 판단
    private static boolean isYoonNyeon(int Y) {
        if (Y % 4 == 0) {
            if (Y % 100 == 0) {
                if (Y % 400 == 0) return true;
                else return false;
            }
            return true;
        }
        return false;
    }

    // 계절 판단
    private static String decideSeason(int M) {
        if (M >= 3 && M <= 5) return "Spring";
        else if (M >= 6 && M <= 8) return "Summer";
        else if (M >= 9 && M <= 11) return "Fall";
        else return "Winter";
    }
}