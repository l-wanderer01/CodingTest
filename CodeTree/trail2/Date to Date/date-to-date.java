import java.util.Scanner;
public class Main {
    static int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int date1 = calcDate(m1, d1);
        int date2 = calcDate(m2, d2);

        System.out.println(date2-date1+1);
    }

    public static int calcDate(int m, int d) {
        int date = d;
        for (int i = 1; i < m; i++) {
            date+=months[i];
        }
        return date;
    }
}