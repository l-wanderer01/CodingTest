import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st; // = new StringTokenizer()
		
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
		    st = new StringTokenizer(br.readLine());
		    int N = Integer.parseInt(st.nextToken());
		    int K = Integer.parseInt(st.nextToken());
		    // 비밀번호 숫자들 받음
		    String passwords = br.readLine();
		    
		    String rotatedPwd = passwords+passwords;
		    
		    Set<Integer> set = new HashSet<>();
		    
		    for (int i=0; i<N/4; i++) {
		        for (int j=i; j<N; j+=N/4) {
		            String pwd = rotatedPwd.substring(j, j+N/4);
		            int intPwd = Integer.parseInt(pwd, 16);
		            set.add(intPwd);
		        }
		    }
		    
    	    int[] pwdList = new int[set.size()];
    	    int idx = 0;
    	    for (int pwd : set) {
    	        pwdList[idx++] = pwd;
    	    }
    	    
    	    Arrays.sort(pwdList); // 오름차순
    	    // 내림차순
    	    int kPwd = pwdList[set.size()-K];
    	    sb.append("#").append(tc).append(" ").append(kPwd).append("\n");
		}
		System.out.print(sb.toString());
	}
}