import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            Queue<Integer> q = new LinkedList<>();

            while (st.hasMoreTokens()) {
                q.offer(Integer.parseInt(st.nextToken()));
            }

            boolean flag = true;

            while (flag) {
                for (int i = 1; i <= 5; i++) {
                    int num = q.poll();
                    num -= i;

                    if (num <= 0) {
                        q.offer(0);
                        flag = false;
                        break;
                    }

                    q.offer(num);
                }
            }

            sb.append("#").append(T).append(" ");

            while (!q.isEmpty()) {
                sb.append(q.poll()).append(" ");
            }

            sb.append("\n");
        }
        System.out.print(sb.toString());
	}
}