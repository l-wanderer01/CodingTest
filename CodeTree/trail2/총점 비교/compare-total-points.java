import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] sArr = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            sArr[i] = new Student(name, score1, score2, score3);
        }
        Arrays.sort(sArr);

        for (int i = 0; i < n; i++) {
            Student s = sArr[i];
            System.out.println(s.name + " " + s.score1 + " " + s.score2 + " " + s.score3);
        }
    }

    public static class Student implements Comparable<Student> {
        String name;
        int score1;
        int score2;
        int score3;

        public Student(String name, int score1, int score2, int score3) {
            this.name = name;
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
        }
        @Override
        public int compareTo(Student s) {
            return (this.score1 + this.score2 + this.score3) - (s.score1 + s.score2 + s.score3);
        }
    }
}