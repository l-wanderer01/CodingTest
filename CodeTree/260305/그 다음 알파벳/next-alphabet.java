import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char c = s.charAt(0);

        int num = c + 1;

        if (num > 'z') c = 'a';
        else c = (char) num;

        System.out.println(c);
    }
}