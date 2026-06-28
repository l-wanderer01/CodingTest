import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            double score = sc.nextDouble();
            sum += score;
        }
        
        double avg = Math.round(sum / N * 10) / 10.0;
        String result = avg >= 4.0 ? "Perfect" : avg >= 3.0 ? "Good" : "Poor";
        
        System.out.println(avg);
        System.out.println(result);
    }
}