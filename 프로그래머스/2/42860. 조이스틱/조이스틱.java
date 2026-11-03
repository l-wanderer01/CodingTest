class Solution {
    public int solution(String name) {
        int answer = 0;
        
        int vertical = calcVertical(name);
        
        findMaxA(name);
        System.out.println("AstartIdx: " + AstartIdx);
        System.out.println("AendIdx: " + AendIdx);
        int horizontal = minHorizontal(name);
        
        answer = vertical + horizontal;
        // System.out.println("horizontal: " + horizontal);
        return answer;
    }
    
    // 위로 하던 밑으로 하던 가장 작은 값을 출력하게 함
    static int matchAlpha(char c) {
        return Math.min(c - 'A', 'Z' - c + 1); // A에서 이동하는걸로 치니까 1을 더해줘야한다!
    }
    
    static int calcVertical(String str) {
        int count = 0; // 수직 조이스틱 조작 횟수 계산
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count += matchAlpha(c);
        }
        
        return count;
    }
    
    // 최장길이 A의 시작 인덱스
    static int AstartIdx = -1;
    // 최장길이 A의 끝 인덱스
    static int AendIdx = -1;
    
    // 연속된 A의 최대 인덱스의 시작 위치와 끝 위치를 찾는다. (핵심)
    static void findMaxA(String str) {
        int seqMax = 0; // A의 최대 연속 횟수
        for (int i = 0; i < str.length(); i++) {
            int cnt = 0; // A의 최대 연속 수 계산
            while (i+cnt < str.length() && str.charAt(i+cnt)=='A') {
                cnt++;
            }
            if (seqMax < cnt) {
                seqMax = cnt;
                AstartIdx=i;
                AendIdx=i+cnt-1;
            }
            i += cnt; // 연속된 A의 개수만큼 점프시킨다.
        }
    }
    
    // 최솟값을 찾는다
    /*
    1. 무조건 오른쪽으로만 이동
    2. 무조건 왼쪽으로만 이동
    3. 오른쪽으로 가다가 A 시작 인덱스에서 왼쪽으로 방향 바꿔서 A의 끝 인덱스까지의 비용
    4. 왼쪽으로 가다가 A의 끝 인덱스에서 오른쪽으로 방향 바꿔서 A의 시작 인덱스까지의 비용
    */
    static int minHorizontal(String str) {
        if (AstartIdx == -1) return str.length() - 1;
        if (AstartIdx == 0 && AendIdx == str.length() - 1) return 0;
        // 끝에 A의 개수
        int idx = str.length() - 1;
        int cnt = 0;
        while(str.charAt(idx) == 'A') {
            cnt++;
            idx--;
        }
        int onlyRight = AendIdx == str.length() - 1 ? AstartIdx - 1: str.length() - 1 - cnt;
        int onlyLeft = AstartIdx <= 1 ? str.length() - 1 - AendIdx : str.length() - 1;
        int rightLeft = AstartIdx <= 1 ? str.length() - 1 - AendIdx : (AstartIdx-1) * 2 + str.length() - 1 - AendIdx;
        int leftRight = AendIdx == str.length() - 1 ? AstartIdx - 1 : (str.length() - 1 - AendIdx) * 2 + AstartIdx-1;
        
        System.out.println("1: " + onlyRight);
        System.out.println("2: " + onlyLeft);
        System.out.println("3: " + rightLeft);
        System.out.println("4: " + leftRight);
        
        int move = Math.min(Math.min(Math.min(onlyRight, onlyLeft), rightLeft), leftRight);
        
        return move;
    }
}
/*
^
ㅜ
< 커서 이동
> 커서 이동

초기 값이 무조건 A로 채워진다.
    
AAAAAA
94
// 위로 하던 밑으로 하던 가장 작은 값을 출력하게 함
static int matchAlpha(char c) {
    return Math.min(c - 'A', 'Z' - c + 1); // A에서 이동하는걸로 치니까 1을 더해줘야한다!
}

// 앞으로 가서 A가 아닌 값을 찾는 비용 vs 뒤로가서 A가 아닌 값을 찾는 비용

왼쪽 vs 오른쪽 비교
A의 위치 값을 저장한다?
그래서 A를 마주치고 다른 값을 만나게하는 비용 vs 반대로 돌아가게하는 비용
결국 가게하는 방향은 똑같다. 한번 가기 시작하면 무조건 그 방향으로!
AXAXA
BBAAAAACAAAAAC (앞으로 가서 A가 연속되면서 )
A를 만날때까진 계속 앞으로 간다.
A를 만나면 그때, 방향 바꾸는게 나은지 그대로 가는게 나은지 계산한다

도저히 모르겠다...
*/