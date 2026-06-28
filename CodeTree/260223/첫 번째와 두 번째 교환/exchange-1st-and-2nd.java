import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] cArr = str.toCharArray();

        char a = cArr[0];
        char b = cArr[1];

        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == a) {
                cArr[i] = b;
            }
            else if (cArr[i] == b) {
                cArr[i] = a;
            }
        }
        
        str = String.valueOf(cArr);

        System.out.println(str);
    }
}