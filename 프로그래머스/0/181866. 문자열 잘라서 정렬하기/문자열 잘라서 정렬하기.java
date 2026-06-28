import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
			.filter(s -> !s.isEmpty()) // 빈 배열이 아닌 것만 filtering
			.sorted() // 정렬
            .toArray(String[]::new);
    }
}