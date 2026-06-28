class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) { // 아이디가 같을 때
                if (id_pw[1].equals(db[i][1])) { // 아이디와 비밀번호 모두 동일
                    return "login";
                }
                else { // 아이디는 같지만 비밀번호가 다를 때
                    return "wrong pw";
                }
            }
        }
        // 아이디가 다를 때
        return "fail";
    }
}