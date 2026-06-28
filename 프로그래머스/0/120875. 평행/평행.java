class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 두 쌍으로 만들어서 기울기를 계산 (y2 - y1)/(x2 - x1)
        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];
        
        double inclinationA = 0, inclinationB = 0;
        inclinationA = x2 > x1 ? (double)(y2 - y1) / (double)(x2 - x1) : (double)(y1 - y2) / (double)(x1 - x2);
        inclinationB = x4 > x3 ? (double)(y4 - y3) / (double)(x4 - x3) : (double)(y3 - y4) / (double)(x3 - x4);
        if (inclinationA == inclinationB) return 1;
        
        inclinationA = x3 > x1 ? (double)(y3 - y1) / (double)(x3 - x1) : (double)(y1 - y3) / (double)(x1 - x3);
        inclinationB = x4 > x2 ? (double)(y4 - y2) / (double)(x4 - x2) : (double)(y2 - y4) / (double)(x2 - x4);
        if (inclinationA == inclinationB) return 1;
        
        inclinationA = x4 > x1 ? (double)(y4 - y1) / (double)(x4 - x1) : (double)(y1 - y4) / (x1 - x4);
        inclinationB = x3 > x2 ? (double)(y3 - y2) / (double)(x3 - x2) : (double)(y2 - y3) / (double)(x2 - x3);
        if (inclinationA == inclinationB) return 1;
        
        return answer;
    }
}