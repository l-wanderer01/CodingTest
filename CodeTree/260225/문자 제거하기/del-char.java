import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        while (str.length() >= 2) {
            int A = sc.nextInt();
            if (A >= str.length()) str = str.substring(0, str.length() - 1);
            else {
                str = str.substring(0, A) + str.substring(A + 1);
            }
            System.out.println(str);
        }
        
    }
}