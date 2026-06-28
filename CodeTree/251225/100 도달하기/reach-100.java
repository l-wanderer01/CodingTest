import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 1, n2 = sc.nextInt();
        System.out.print(n1 + " " + n2 + " ");

        while (n2 <= 100) {
            int tmp = n1 + n2;
            System.out.print(tmp + " ");
            n1 = n2;
            n2 = tmp;
        }
    }
}