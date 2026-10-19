import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(isTwo(A));
    }

    static String isTwo(String str) {
        char[] cArr = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < cArr.length-1; i++) {
            if (cArr[i] != cArr[i+1]) cnt++;
        }

        return cnt >= 1 ? "Yes" : "No";
    }
}