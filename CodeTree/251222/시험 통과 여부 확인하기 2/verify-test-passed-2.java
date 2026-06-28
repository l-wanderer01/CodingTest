import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int student = sc.nextInt();
        int p_student = 0;
        sc.nextLine(); // 첫번째 입력줄 제거

        for (int i = 0; i < student; i++) {
            String scores = sc.nextLine();
            String[] score = scores.split(" ");
            
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(score[j]);
            }
            if (sum / 4 >= 60.0) {
                System.out.println("pass");
                p_student++;
            }
            else System.out.println("fail");
        }

        System.out.println(p_student);
    }
}