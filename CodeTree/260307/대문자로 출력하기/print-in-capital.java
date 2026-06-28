import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if (target >= 'A' && target <= 'Z') {
                sb.append(target);
            }
            else if (target <= 'z' && target >= 'a') {
                char c = (char)(target - 'a' + 'A');
                sb.append(c);
            }
        }
        
        String answer = sb.toString();

        System.out.println(answer);
    }
}