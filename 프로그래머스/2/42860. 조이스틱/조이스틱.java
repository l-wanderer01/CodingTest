class Solution {
    public int solution(String name) {
        int answer = 0;
        // 각 문자를 A에서 변경하는 최소의 위아래 조작 횟수 카운트
        int vertical = calcVertical(name);
        
        // 오른쪽, 왼쪽, 오른쪽→왼쪽, 왼쪽→오른쪽 이동 비용 중 최소 선택
        int horizontal = countHorizontalMove(name);
        
        answer = vertical + horizontal;

        return answer;
    }
    
    static int calcVertical(String name) {
        int count = 0; // 수직 조이스틱 조작 횟수 계산
        
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            count += matchAlpha(c);
        }
        
        return count;
    }
    
    // 위로 하던 밑으로 하던 가장 작은 값을 출력하게 함
    static int matchAlpha(char c) {
        // A에서 이동하는걸로 치니까 1을 더해줘야한다!
        return Math.min(c - 'A', 'Z' - c + 1);
    }
    
    static int countHorizontalMove(String name) {
        int length = name.length();
        // 무조건 오른쪽으로만 이동
        int minMoves = name.length() - 1;

        for (int currentIdx = 0; currentIdx < length; currentIdx++) {
            // 현재 위치 뒤의 연속된 A를 건너뛴 인덱스
            int nextNotAIdx = currentIdx + 1;

            while (nextNotAIdx < length && name.charAt(nextNotAIdx) == 'A') {
                nextNotAIdx++;
            }

            // 1. 오른쪽으로만 이동할 거리
            int rightMoves = currentIdx;

            // 2. 왼쪽으로만 이동할 거리
            int leftMoves = length - nextNotAIdx;

            // 3. 오른쪽으로 가다가 왼쪽으로 방향 전환
            int rightLeftMoves = rightMoves * 2 + leftMoves;

            // 4. 왼쪽으로 가다가 오른쪽으로 방향 전환
            int leftRightMoves = rightMoves + leftMoves * 2;

            minMoves = Math.min(
                minMoves,
                Math.min(rightLeftMoves, leftRightMoves)
            );
        }

        return minMoves;
    }
}