import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        for (int i = 0; i < 8; i++) {
            double score = sc.nextDouble();
            sum += score;
        }

        double avg = Math.round(sum / 8 * 10.0)/10.0;

        System.out.println(avg);
    }
}