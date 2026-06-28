import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        
        String[] arr = input.split(" ");
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[idx].equals("0")) break;
            idx += 1;
        }

        for (int i = idx - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}