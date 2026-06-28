import java.util.*;

public class Main {

    private static class StringCode{
        String secretCode;
        char meetingPoint;
        int time;

        private StringCode(String secretCode, char meetingPoint, int time) {
            this.secretCode = secretCode;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr= sc.nextLine().split(" ");

        StringCode strC = new StringCode(strArr[0], strArr[1].charAt(0), Integer.parseInt(strArr[2]));

        System.out.printf("secret code : %s\n", strC.secretCode);
        System.out.printf("meeting point : %s\n", strC.meetingPoint);
        System.out.printf("time : %s\n", strC.time);
    }
}