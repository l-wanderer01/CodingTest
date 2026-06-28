import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0, i = 1;
        while (cnt < 2) {
            if (N * i % 5 == 0) cnt++;
            System.out.print(N * i + " ");
            i++;
        }
    }
}