import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String direct = sc.next();

        int cnt = 0; // 방향 정보 저장 (음수 : L, 양수 : R)

        for (int i = 0; i < direct.length(); i++) {
            if (direct.charAt(i) == 'L') {
                cnt--;
            }
            else cnt++;
        }

        if (cnt > 0) cnt %= s.length();
        else {
            cnt *= -1;
            cnt %= s.length();
            cnt *= -1;
        }

        if (cnt < 0) {
            int left = cnt * -1;
            s = s.substring(left) + s.substring(0, left);
        }
        else if (cnt > 0) {
            int right = cnt;
            s = s.substring(s.length() - right) + s.substring(0, s.length() - right);
        }

        System.out.printf("%s", s);
    }
}