// import java.util.Scanner;
import java.util.*;

public class Main {
    public static final int MAX_N = 1000;

    public static int[] h = new int[MAX_N];
    public static int[] w = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] sArr = new Student[n];
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            sArr[i] = new Student(i+1, h, w);
        }
        
        Arrays.sort(sArr);

        for (int i = 0; i < n; i++) {
            Student s = sArr[i];
            System.out.println(s.h + " " + s.w + " " + s.id);
        }
        

    }

    static class Student implements Comparable<Student> {
        int id;
        int h;
        int w;
        
        public Student(int id, int h, int w) {
            this.id = id;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Student o) {
            if (this.h == o.h) {
                return o.w - this.w;
            }
            return this.h - o.h;
        }
    }
}
