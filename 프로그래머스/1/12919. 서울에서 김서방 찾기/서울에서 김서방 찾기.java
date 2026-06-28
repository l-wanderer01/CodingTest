import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        // 탐색
        // int index = Arrays.stream(seoul)
        //     .forEach(i -> i)
        //     .filter(i == "Kim")
        //     .findFirst()
        //     .indexOf(i);
        
        // int index = 0;
        // for (int i = 0; i < seoul.length; i++) {
        //     if (seoul[i].equals("Kim")) {
        //         answer = "김서방은 " + i + "에 있다";
        //         break;
        //     }
        // }
        
        int index = Arrays.asList(seoul).indexOf("Kim"); // 리스트로 변경 후, Kim이라는 값이 있다면 해당 값의 인덱스 추출
        answer = "김서방은 " + index + "에 있다";
            
        return answer;
    }
}