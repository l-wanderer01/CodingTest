import java.util.*;

public class Main {

    private static class NextLevel {
        String id;
        int level;

        private NextLevel() {
            this.id = "codetree";
            this.level = 10;
        }

        private NextLevel(String id, int level) {
            this.id = id;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        NextLevel nl1 = new NextLevel();
        NextLevel nl2 = new NextLevel(id, level);

        System.out.printf("user %s lv %d\n", nl1.id, nl1.level);
        System.out.printf("user %s lv %d", nl2.id, nl2.level);
    }
}