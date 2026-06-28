import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num == 0) break;
            sum += num;
            cnt++;
        }

        double avg = Math.round((double) sum / cnt * 10.0) / 10.0;

        System.out.println(sum + " " + avg);
    }
}