import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 100; i++) {
            int num = sc.nextInt();
            if (num == 0) break;
            else {
                num = num % 2 == 0 ? num / 2 : num + 3;
            }
            System.out.print(num + " ");
        }
    }
}