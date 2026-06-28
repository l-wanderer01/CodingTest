import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer = new int[4];
        
        for (int i = 0; i < 3; i++) {
            String str = sc.nextLine();
            String[] sArr = str.split(" ");
            int rate = 0; // A B C D 진료소

            if (sArr[0].equals("Y") && Integer.parseInt(sArr[1]) >= 37) rate = 0;
            else if (sArr[0].equals("N") && Integer.parseInt(sArr[1]) >= 37) rate = 1;
            else if (sArr[0].equals("Y") && Integer.parseInt(sArr[1]) < 37) rate = 2;
            else rate = 3;

            answer[rate] += 1;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }

        if (answer[0] >= 2) System.out.print("E");
    }
}