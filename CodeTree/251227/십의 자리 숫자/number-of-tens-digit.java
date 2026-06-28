import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] answer = new int[10];

        for (int i = 0; i < 100; i++) {
            int num = sc.nextInt();

            if (num == 0) break;
            else {
                answer[num / 10]++;
            }
        }

        for (int i = 1; i < answer.length; i++) {
            System.out.println(i + " - " + answer[i]);
        }
    }
}