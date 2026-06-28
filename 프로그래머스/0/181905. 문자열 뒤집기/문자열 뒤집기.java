class Solution {
    public String solution(String my_string, int s, int e) {
        String[] sarr = my_string.split("");
        while (s < e){
            String tmp = sarr[s];
            sarr[s] = sarr[e];
            sarr[e] = tmp;
            s++;
            e--;
        }
        
        return String.join("", sarr);
    }
}