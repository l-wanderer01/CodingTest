import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(isTwo(A));
    }

    static String isTwo(String str) {
        char[] cArr = str.toCharArray();
        boolean[] check = new boolean['z' - 'a'+1];
        for (int i = 0; i < cArr.length; i++) {
            int current = cArr[i]-'a';
            if (!check[current]) check[current] = true;
        }

        int cnt = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i]) cnt++;
        }

        return cnt >= 2 ? "Yes" : "No";
    }
}