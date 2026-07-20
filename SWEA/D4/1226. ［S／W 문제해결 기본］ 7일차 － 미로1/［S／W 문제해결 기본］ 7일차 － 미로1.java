import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Solution {
    static int N = 16;

    public static void main(String args[]) throws Exception
    {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
        // System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("res/input_5.txt")));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 상하좌우
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        for(int test_case = 1; test_case <= 10; test_case++) {
            int tc = Integer.parseInt(br.readLine()); // input.txt를 보면 필요한건가...

            int[][] maze = new int[N][N];
            boolean[][] checkbox = new boolean[N][N];
            // 시작점
            Node start;
            // bfs를 위한 Queue
            Queue<Node> q = new LinkedList<>();
            // 최종 output
            int res = 0;

            for (int r = 0; r < 16; r++) {
                String row = br.readLine();
                String[] cols = row.split("");
                for (int c = 0; c < 16; c++) {
//                    st = new StringTokenizer(row);
//                    String element = st.nextToken("\0"); // nextToken은 기본적으로 띄어쓰기를 기준으로 자르는데 얘는 어카지
                    maze[r][c] = Integer.parseInt(cols[c]);
                    if (maze[r][c] == 2) {
                        q.add(new Node(r, c));
                       	checkbox[r][c] = true; // queue에 넣은 후 check
                    }
                }
            }

            // queue가 빌 때까지 반복
            while (!q.isEmpty()) {
                // queue에서 하나 꺼내옴
                Node n = q.poll();
                // + 순회
                for (int i = 0; i < 4; i++) {
                    int nr = n.x + dr[i];
                    int nc = n.y + dc[i];
                    // 1. 배열을 넘지 않는지
                    if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
                    // 2. 벽이 아닌지
                    if (maze[nr][nc] == 1) continue;
                    // 3. 이미 확인한 길인지
                    if (checkbox[nr][nc]) continue;
                    // 4. 최종 목적지인지
                    if (maze[nr][nc] == 3) {
                        res = 1;
                        break;
                    }

                    q.add(new Node(nr, nc));
                    checkbox[nr][nc] = true;
                }
            }

            sb.append("#").append(test_case).append(" ").append(res).append("\n");
        }
        System.out.println(sb);
    }

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}