import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] answer = new int[11];

        for (int i = 0; i < 100; i++) {
            int score = sc.nextInt();
            if (score == 0) break;
            else {
                answer[score / 10] += 1;
            }
        }

        for (int i = answer.length - 1; i > 0; i--) {
            System.out.println(i * 10 + " - " + answer[i]);
        }
    }
}