import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        int sum = 0;

        String A_num = "";
        String B_num = "";
        
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (Character.isDigit(c)) {
                A_num += c + "";
            }
        }

        for (int i = 0; i < B.length(); i++) {
            char c = B.charAt(i);
            if (Character.isDigit(c)) {
                B_num += c + "";
            }
        }
    
        sum = Integer.parseInt(A_num) + Integer.parseInt(B_num);

        System.out.printf("%d", sum);
    }
}