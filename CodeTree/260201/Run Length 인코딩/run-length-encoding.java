import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next() + " ";
        
        int cnt = 0; // 누적 개수
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }
            else {
                cnt += 1;
                char c = str.charAt(i);
                result += c;
                result += cnt;
                cnt = 0;
            }
        }
        
        System.out.println(result.length());
        System.out.println(result);
    }
}