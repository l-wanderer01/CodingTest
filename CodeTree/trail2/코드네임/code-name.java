import java.util.*;

public class Main {

    private static class Agent {
        String codeName;
        int score;

        public Agent() {
            this.codeName = "";
            this.score = 101;
        }

        public Agent(String codeName, int score) {
            this.codeName = codeName;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] arr = new Agent[]{
            new Agent(),
            new Agent(),
            new Agent(),
            new Agent(),
            new Agent(),
        };

        for (int i = 0; i < 5; i++) {
            String[] line = sc.nextLine().split(" ");
            arr[i].codeName = line[0];
            arr[i].score = Integer.parseInt(line[1]);
            
            if (i != 0 && arr[i].score < arr[0].score) {
                Agent temp = new Agent();
                temp.codeName = arr[0].codeName;
                temp.score = arr[0].score;

                arr[0].codeName = arr[i].codeName;
                arr[0].score = arr[i].score;

                arr[i].codeName = temp.codeName;
                arr[i].score = temp.score;
            }
            
        }

        System.out.printf("%s %d", arr[0].codeName, arr[0].score);
    }
}