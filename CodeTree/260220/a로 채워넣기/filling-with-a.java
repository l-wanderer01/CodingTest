import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] cArr = str.toCharArray();

        cArr[1] = 'a';
        cArr[str.length() - 2] = 'a';

        str = String.valueOf(cArr);
        System.out.println(str);
    }
}