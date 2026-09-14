import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            Student s = new Student(name, height, weight);
            students[i] = s;
        }

        Arrays.sort(students, (a, b) -> {
            if (a.height == b.height) {
                return b.weight - a.weight;
            }
            return a.height - b.height;
        });

        for (int i = 0; i < n; i++) {
            Student s = students[i];
            System.out.println(s.name + " " + s.height + " " + s.weight);
        }
    }

    public static class Student {
        String name;
        int height;
        int weight;

        public Student(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
}
