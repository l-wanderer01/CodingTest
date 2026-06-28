import java.util.*;

public class Main {
    private static class People {
        String name;
        String addr;
        String city;

        public People () {
            this.name = "";
            this.addr = "";
            this.city = "";
        }

        public People (String name, String addr, String city) {
            this.name = name;
            this.addr = addr;
            this.city = city;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // nextInt()로 숫자만 읽고 남은 "\n" 제거

        People[] p = new People[N];

        for (int i = 0; i < N; i++) {
            String[] arr = sc.nextLine().split(" "); // 띄어쓰기로 구분되어있으면 sc.next()로 끊는게 좋다!
            // 지금의 방식은 여러번 띄어쓰기가 되어있으면 못잡는다!
            p[i] = new People(arr[0], arr[1], arr[2]);
            // p[i] = new People(sc.next(), sc.next(), sc.next());
        }
        
        int idx = 0;
        // 문자열 정렬 : compareTo
        for (int i = 1; i < N; i++) {
            if (p[idx].name.compareTo(p[i].name) < 0) { // 문자열 비교 (비교 주체가 사전순으로 앞이라면 음수(-1) 반환
                idx = i;
            }
        }

        System.out.printf("name %s\n", p[idx].name);
        System.out.printf("addr %s\n", p[idx].addr);
        System.out.printf("city %s\n", p[idx].city);
    }
}