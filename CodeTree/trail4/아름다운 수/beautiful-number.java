import java.util.*;

public class Main {
    static int N;
    static int[] numbers;
    static int res; // 총 아름다운 수의 개수 반환

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        
        numbers = new int[N];
        res = 0;

        permutation(0);

        System.out.println(res);
    }

    static void permutation(int cnt) {
        if (cnt == N) {
            if (isPrettyNumber(numbers)) {
                res++;
                // String str = Arrays.toString(numbers);
                // System.out.println(str);
            }
            return;
        }

        for (int i = 1; i <= 4; i++) {
            numbers[cnt] = i;
            permutation(cnt+1);
        }
    }

    // 아름다운 수인지 확인
    static boolean isPrettyNumber(int[] numbers) {
        // 만들어진 순열 전체 순회
        for (int i = 0; i < numbers.length;) {
            // 몇개 연속으로 같은 수인지 확인할 숫자
            int num = numbers[i];
            // 지금 인덱스부터 연속이어야하는 인덱스까지 순회
            if (i + num > numbers.length) return false; // 숫자가 중간에 끊긴다면 그 즉시 종료
            for (int j = i; j < i+num; j++) {
                if (numbers[j] != num) return false;
            }
            // 아름다운 수인거 확인한 만큼 칸 이동
            i += num;
        }
        return true;
    }
}

// 1. 중복순열 만든다.
// 2. 그 순열이 아름다운 수의 조합으로 이뤄져있는지 판별한다.
    // 첫 자리 숫자 계산, 그 자리부터 숫자만큼 배열 확인하고, 그 배열에 수가 모두 동일한 숫자인지 확인

// [1, 1, 1]
// [1, 2, 1]
// [1, 3, 1]
// [1, 4, 1]
// [2, 2, 1]
// [2, 2, 2]
// [2, 2, 3]
// [2, 2, 4]
// [3, 3, 3]

// [1, 2, 2] 가 없다.