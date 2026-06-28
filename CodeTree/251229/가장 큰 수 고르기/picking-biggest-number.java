import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = sc.nextInt();
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            if (max < num) max = num;
        }

        System.out.println(max);
    }
}