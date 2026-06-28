import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num > 500) {
                if (num - 500 > max) max = num;
            }
            else {
                if (500 - num > min) min = num;
            }
        }

        System.out.printf("%d %d", min, max);
    }
}