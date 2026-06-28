import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        
        String input = sc.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) != ' ') str += input.charAt(i);
        }

        System.out.println(str);
    }
}