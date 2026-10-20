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
        
        int tWordIdx = -1; // 없을수도 있기에 안전하게 인덱스에 포함되지 않는 값으로 초기화

        for (int idx = 0; idx < words.length; idx++) {
            String s = words[idx];
            boolean flag = true;
            int checkIdx = (tLength + 1)/2;
            if (s.length() < tLength) continue; // 비교 대상의 길이가 더 길다면 예외처리
            
            for (int i = 0; i < checkIdx; i++) { // 이렇게 안하고 String의 startWith() 매서드나 substring() 매서드를 써서 해결할 수도 있다!
                // 양 끝값부터 중간값까지 log 비교
                if (s.charAt(i) != t.charAt(i) || t.charAt(tLength-1-i) != s.charAt(tLength-1-i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                tWordIdx = idx;
                break;
            }
        }
        System.out.print(words[tWordIdx+k-1]);
    }
}