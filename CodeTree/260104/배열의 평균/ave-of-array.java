import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 가로 평균
        for (int i = 0; i < 2; i++) {
            double avg = 0;
            for (int j = 0; j < 4; j++) {
                avg += arr[i][j];
            }
            avg /= 4;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        // 세로 평균
        for (int j = 0; j < 4; j++) {
            double avg = 0;
            for (int i = 0; i < 2; i++) {
                avg += arr[i][j];
            }
            avg /= 2;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        // 전체 평균
        double avg = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                avg += arr[i][j];
            }
        }
        avg /= 8;
        System.out.printf("%.1f", avg);
    }
}