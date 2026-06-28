import java.util.*;

public class Main {
    static int a, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        modified(a, b);

        System.out.printf("%d %d", a, b);
    }

    private static void modified(int x, int y) {
        // a, b를 매개변수로 선언하면 오류가 난다. 함수 내부에서 클래스 변수 a,b가 아닌 지역변수 a,b로 값을 복사해 사용하게 됨으로써, 힘수가 종료된 후에 해당 값이 사라짐! -> 변수 스코프상 이름이 곂칠 때, 작은 단위의 변수로 인식하기 때문!
        if (x > y) {
            a += 25;
            b *= 2;
        }
        else {
            a *= 2;
            b += 25;
        }
    }
}