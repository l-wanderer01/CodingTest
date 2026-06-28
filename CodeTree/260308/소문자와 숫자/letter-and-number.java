import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 공백을 포함한 한 줄 전체를 입력받으려면 nextLine()이 안전합니다.
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (char x : str.toCharArray()) {
            // 해당 문자가 영문자이거나 숫자인지 확인
            if (Character.isLetterOrDigit(x)) {
                // 소문자로 변환하여 저장
                sb.append(Character.toLowerCase(x));
            }
        }

        System.out.println(sb.toString());
    }
}