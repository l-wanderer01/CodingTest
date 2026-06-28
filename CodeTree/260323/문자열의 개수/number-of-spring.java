import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> al = new ArrayList<>();
        String str = sc.nextLine();

        while (!str.equals("0") && sc.hasNext()) {
            al.add(str);
            str = sc.nextLine();
        }

        System.out.println(al.size());
        for (int i = 0; i < al.size(); i+=2) {
            System.out.println(al.get(i));
        }
    }
}