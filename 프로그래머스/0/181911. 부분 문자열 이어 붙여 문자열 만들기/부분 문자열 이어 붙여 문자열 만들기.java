class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int[] arr = parts[i];
            String part = str.substring(arr[0], arr[1] + 1);
            sb.append(part);
        }
        
        return sb.toString();
    }
}