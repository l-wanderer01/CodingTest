import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N개의 단어
        int k = sc.nextInt();
        String t = sc.next(); // 기준 문자열
        int tLength = t.length();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        Arrays.sort(words);
        // System.out.println(Arrays.toString(words));
        
        int tWordIdx = 0;

        for (int idx = 0; idx < words.length; idx++) {
            String s = words[idx];
            boolean flag = false;
            int checkIdx = t.length()/2;
            if (s.length() < tLength) continue; // 비교 대상의 길이가 더 길다면 예외처리
            String temp = s.substring(0, tLength);
            if (temp.equals(t)) {
                tWordIdx = idx;
                break;
            }
            // for (int i = 0; i < checkIdx; i++) {
            //     if (s.charAt(i) != t.charAt(i) || t.charAt(tLength-1-i) != s.charAt(tLength-1-i)) continue;
            //     tWordIdx = idx;
            //     flag = true;
            //     // System.out.println("flag = true : " + words[tWordIdx]);
            //     break;
            // }
            // if (flag) break;
        }
        System.out.print(words[tWordIdx+k-1]);
    }
}