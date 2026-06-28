import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt(), N2 = sc.nextInt();
        int[] arr1 = new int[N1];
        int[] arr2 = new int[N2];

        for (int i = 0; i < N1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < N2; i++) {
            arr2[i] = sc.nextInt();
        }

        String answer = "No";

        for (int i = 0; i < arr1.length; i++) {
            if (i + N2 > N1) break; // 배열 길이 비교
            if (arr1[i] == arr2[0]) {
                answer = "Yes";
                for (int j = 1; j < arr2.length; j++) {
                    if (arr1[i + j] != arr2[j]) {
                        answer = "No";
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}