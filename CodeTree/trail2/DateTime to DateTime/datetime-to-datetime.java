import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int end = calcDateTime(A, B, C);
        int start = calcDateTime(11, 11, 11);

        int total = end - start;
        total = total >= 0 ? total : -1;
        System.out.println(total);
    }

    public static int calcDateTime(int day, int hour, int min) {
        int total = day*24*60 + hour*60 + min;
        return total;
    }
}