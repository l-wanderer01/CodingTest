import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        String[] sarr = my_string.split("");
        
        Arrays.sort(indices);
        
        for (int i = 0; i < my_string.length(); i++) {
            if(Arrays.binarySearch(indices, i) >= 0) continue;
            sb.append(sarr[i]);
        }
        
        return sb.toString();
    }
}