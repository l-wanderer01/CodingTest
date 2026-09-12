import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(i+1, height, weight);
        }
        
        Arrays.sort(
            students,
            (a, b) -> {
                if (a.height != b.height) {
                    return Integer.compare(b.height, a.height);
                }
                if (a.weight != b.weight) {
                    return Integer.compare(b.weight, a.weight);
                }
                return Integer.compare(a.id, b.id);
            }
        );

        for (int i = 0; i < n; i++) {
            Student s = students[i];
            System.out.println(s.height + " " + s.weight + " " + s.id);
        }
    }

    public static class Student {
        int id;
        int height;
        int weight;

        public Student(int id, int height, int weight) {
            this.id = id;
            this.height = height;
            this.weight = weight;
        }
    }
}