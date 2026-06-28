import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i++) {
            sb.append(my_str.charAt(i));
            if ((i + 1) % n == 0 || i + 1 == my_str.length()) {
                al.add(sb.toString());
                sb.delete(0, sb.length());
            }
        }
        
        return al.stream()
                .toArray(String[]::new);
    }
}