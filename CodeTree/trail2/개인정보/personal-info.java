import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        People[] peoples = new People[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            People people = new People(name, height, weight);
            peoples[i] = people;
        }

        // 이름 순 정렬        
        Arrays.sort(peoples, (a, b) -> {
            return a.name.compareTo(b.name);
        });

        System.out.println("name");
        for (int i = 0; i < n; i++) {
            System.out.println(peoples[i].name + " " + peoples[i].height + " " + peoples[i].weight);
        }

        // 키 순 정렬
        Arrays.sort(peoples, (a, b) -> {
            return b.height - a.height;
        });
        System.out.println("\nheight");
        for (int i = 0; i < n; i++) {
            System.out.println(peoples[i].name + " " + peoples[i].height + " " + peoples[i].weight);
        }
    }

    public static class People {
        String name;
        int height;
        double weight;

        public People (String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
}