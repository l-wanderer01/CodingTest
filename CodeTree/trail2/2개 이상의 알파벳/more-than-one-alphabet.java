import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(isTwo(A));
    }

    static String isTwo(String str) {
        char[] cArr = str.toCharArray();
        boolean check = false;
        for (int i = 0; i < cArr.length-1; i++) {
            if (cArr[i] != cArr[i+1]) { // 2이상인지만 비교하면 되니까 모두 다같은 문자인지만 확인하면 된다.
                check = true; // 앞 뒤의 문자가 2개 이상 사용된거니까 2개 이상 사용되었음을 표시
                break;
            }
        }

        return check ? "Yes" : "No";
    }
}