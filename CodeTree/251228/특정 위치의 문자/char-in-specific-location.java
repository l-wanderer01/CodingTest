import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] arr = {"L", "E", "B", "R", "O", "S"};
        String str = sc.next();
        
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println("None");
        }
        else {
            System.out.println(idx);
        }
    }
}