import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            else {
                c = Character.toLowerCase(c);
            }
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}