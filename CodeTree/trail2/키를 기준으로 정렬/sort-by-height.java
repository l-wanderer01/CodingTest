import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];

        People[] peoples = new People[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            People p = new People(name[i], height[i], weight[i]);
            peoples[i] = p;
        }

        // 방법 1. 오버라이드한 속성으로 정렬
        // Arrays.sort(peoples);
        // 방법 2. Lambda 식을 활용해 복잡한 코드 제거 (Java 8부터 가능)
        Arrays.sort(peoples, (a,b) -> a.height - b.height);

        for (int i = 0; i < n; i++) {
            System.out.println(peoples[i].toString());
        }
    }

    // Comparator와 Compatable의 차이...(중요)
    // public static class People implements Comparable<People>{
    public static class People {
        String name;
        int height;
        int weight;

        public People(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        // // 정렬을 위한 오버라이드
        // @Override
        // public int compareTo(People people) {
        //     return this.height - people.height;
        // }

        // 출력 문을 위한 오버라이드
        @Override
        public String toString() {
            return this.name + " " + this.height + " " + this.weight;
        }
    }
}