class Solution {
    public char checkCharacter(char c, String skip, int index) {
        char current = c;
        
        for (int i = 0; i < index; i++) {
            do {
                // 일단 1칸 이동
                current++;
                
                // 'z'를 넘어간다면 'a'로 처리
                if (current > 'z') current = 'a';
            } // 이동한 결과가 skip에 포함되어 있다면 다시 do 문 수행
            while (skip.contains(String.valueOf(current)));
        }
        
        return current;
    }
    
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            sb.append(checkCharacter(s.charAt(i), skip, index));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}