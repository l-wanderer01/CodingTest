import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
//         String[] answer = new String[strings.length];
//         char[] tmp = new char[strings.length];
        
//         for (int i = 0; i < strings.length; i++) {
//             tmp[i] = strings[i].charAt(n);
//         }
        
//         Arrays.sort(tmp); // tmp를 정렬 후 strings의 각 n번째 문자와 비교해 같다면 앞쪽에 위치
//         for (int i = 0; i < strings.length; i++) {
//             for (int j = 0; j < strings.length; j++) {
//                 if (tmp[i] == strings[j].charAt(n)) {
//                     if (Arrays.asList(answer).contains(strings[j])) continue; // asList : 배열을 고정 크기의 리스트로 반환해줌
//                     else {
//                         answer[i] = strings[j];
//                     }
//                 }   
//             }
//         }
        
//         return answer;
        
        Arrays.sort(strings, (a, b) -> {
            char charA = a.charAt(n);
            char charB = b.charAt(n);
            
            if (charA != charB) {
                return Character.compare(charA, charB);
            }
            else {
                return a.compareTo(b);
            }
        });
        
        return strings;
    }
}