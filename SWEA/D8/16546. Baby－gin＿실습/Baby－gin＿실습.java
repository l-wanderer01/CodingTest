import java.io.*;
import java.util.Arrays;

// 그리디 풀이
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String str = br.readLine();
            int[] numbers = new int[10];
            for (int i = 0; i < 6; i++) {
                int num = str.charAt(i)-'0';
                numbers[num]++;
            }

            int babygin = 0;
            // 딱 2번 반복.
            for (int i = 0; i < 2; i++) {
                // triple이 되는게 있는지 확인
                for (int idx = 0; idx <= 9; idx++) {
                    if (numbers[idx] >= 3) {
                        numbers[idx] -= 3; // 3 감소시킴
                        babygin++;
                        break;
                    }
                }

                // run이 되는게 있는지 확인 (3개의 연속된 숫자 있는지 확인)
                for (int idx = 0; idx <= 7; idx++) {
                    if (numbers[idx] != 0 && numbers[idx+1] != 0 && numbers[idx+2] != 0) {
                        numbers[idx]--;
                        numbers[idx+1]--;
                        numbers[idx+2]--;
                        babygin++;

                        break;
                    }
                }
            }

            boolean res = false;
            if (babygin == 2) res = true;

            sb.append("#").append(tc).append(" ").append(res).append("\n");
        }
        System.out.print(sb.toString());
    }   
}