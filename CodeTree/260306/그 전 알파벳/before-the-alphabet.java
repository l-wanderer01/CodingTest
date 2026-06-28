import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = '\0';

        if (str.charAt(0) == 'a') c = 'z';
        else {
            c = (char)(str.charAt(0) - 1);
        }

        System.out.printf("%c", c);
    }
}