import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = s.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        String cal = arr[1];
        String res = "";
        if (cal.equals("+")) {
            res = sum(a, b);
        }
        else if (cal.equals("-")) {
            res = minus(a, b);
        }
        else if (cal.equals("*")) {
            res = mul(a, b);
        }
        else if (cal.equals("/")) {
            res = div(a, b);
        }
        else {
            System.out.printf("False");
            return;
        }
        s += " = " + res;
        System.out.printf("%s", s);
    }

    private static String sum(int a, int b) {
        return a+b+"";
    }

    private static String minus(int a, int b) {
        return a-b+"";
    }

    private static String mul(int a, int b) {
        return a*b+"";
    }

    private static String div(int a, int b) {
        return a/b+"";
    }
}