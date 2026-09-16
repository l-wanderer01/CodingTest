import java.util.Scanner;
public class Main {
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
            if (i == 2) {
                date += 28;
            }
            else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                date += 31;
            }
            else date += 30;
        }
        return date;
    }
}