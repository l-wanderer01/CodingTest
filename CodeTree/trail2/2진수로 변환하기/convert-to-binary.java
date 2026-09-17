import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = "";
        if (n == 0) binary += "0";
        
        while(n > 0) {
            int bin = n%2;
            n /= 2;
            binary += bin +"";
        }
        
        String res = "";
        for (int i = binary.length()-1; i >= 0; i--) {
            res += binary.charAt(i);
        }

        System.out.println(res);
    }
}