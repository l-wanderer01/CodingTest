import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String charactor = sc.next();
        int answer = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == charactor.charAt(0)) answer++;
        }

        System.out.println(answer);
    }
}