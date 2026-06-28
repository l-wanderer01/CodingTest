import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String target = sc.next();
        
        int idx = -1; // 인덱스 정보 저장

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target.charAt(0)) {
                int len = 1;
                for (int j = 1; j < target.length(); j++) {
                    if (i + j >= str.length()) break;
                    else if (str.charAt(i + j) == target.charAt(j)) len++;
                }
                if (len == target.length()) {
                    idx = i;
                    break;
                }
            }
        }

        System.out.println(idx);
    }
}