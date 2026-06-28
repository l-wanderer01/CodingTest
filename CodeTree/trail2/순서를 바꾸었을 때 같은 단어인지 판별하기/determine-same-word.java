import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);

        if (str1.length() != str2.length()) System.out.print("No");
        else {
            isSame(strArr1, strArr2);
        }
    }

    private static void isSame(char[] arr1, char[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.print("No");
                return;
            }
        }

        System.out.print("Yes");
    }
}