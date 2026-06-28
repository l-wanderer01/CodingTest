import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = {"apple", "banana", "grape", "blueberry", "orange"};

        String s = sc.next();
        int answer = 0;

        for(int i = 0; i<5;i++) {
            String tmp = strArr[i];

            if (tmp.charAt(2) == s.charAt(0)|| tmp.charAt(3) == s.charAt(0)) {
                System.out.println(tmp);
                answer++;
            }
        }

        System.out.print(answer);
    }
}