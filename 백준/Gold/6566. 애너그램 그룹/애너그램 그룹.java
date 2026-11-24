import java.util.*;
import java.io.*;

public class Main
{   
    static Map<String, List<String>> group = new HashMap<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
		    String str = br.readLine();
		    if (str == null) break;
		    
		    char[] cArr = str.toCharArray();
		    Arrays.sort(cArr);
		    String target = new String(cArr);
		  //  System.out.println(target);
		    List<String> list = group.getOrDefault(target, new ArrayList<>());
		    // target(정렬한 값)을 키로 갖고, 원본 str을 리스트로 추가
		    list.add(str);
		    group.put(target, list);
		}
		
		List<List<String>> values = new ArrayList<>(group.values());
		List<String> keys = new ArrayList<>(group.keySet());
		values.sort((a,b) -> {
		    if (a.size() == b.size()) {
		        return a.get(0).compareTo(b.get(0));
		    }
		    return b.size() - a.size();
		});
		
		for (int i = 0; i < 5; i++) {
		    List<String> current = values.get(i);
		    current.sort((a,b) -> a.compareTo(b));
		    sb.append("Group of size ").append(current.size()).append(": ");
		    for (int j = 0; j < current.size(); j++) {
		        if (j != 0 && current.get(j-1).equals(current.get(j))) continue;
		        sb.append(current.get(j)).append(" ");
		    }
		    sb.append(".\n");
		}
		
		System.out.print(sb.toString());
	}
}