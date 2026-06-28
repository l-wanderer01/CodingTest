import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0, cnt = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num >= 250) break;
            else {
                sum += num;
                cnt++;
            }
        }

        double avg = (double) sum / cnt;
        avg = Math.round(avg * 10) / 10.0; // 소수점 첫째자리에서 반올림
        // System.out.println(sum + " " + String.format("%.1f", avg)); // 평균을 소수점 첫째자리까지 계산
        System.out.println(sum + " " + avg);
    }
}