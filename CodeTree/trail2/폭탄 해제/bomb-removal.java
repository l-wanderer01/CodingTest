import java.util.*;

public class Main {

    private static class Bomb {
        String code;
        char color;
        int second;

        private Bomb(String code, char color, int second) {
            this.code = code;
            this.color = color;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        Bomb bomb = new Bomb(arr[0], arr[1].charAt(0), Integer.parseInt(arr[2]));

        System.out.printf("code : %s\n", bomb.code);
        System.out.printf("color : %c\n", bomb.color);
        System.out.printf("second : %d\n", bomb.second);
    }
}