import java.util.Scanner;

public class Test3_03 {
  public int solution(int n, int k, int[] arr) {
    int sum = 0;
    int result = 0;
    // 처음에 창문을 만들어줌
    for (int i = 0; i < k; i++) {
      sum += arr[i];
    }
    // for 문 돌면서 값비교 해야하기 때문에 초기화
    result = sum;

    for (int i = k; i <n; i++) {
      sum += arr[i] - arr[i-k];
      result = Math.max(sum,result);
    }

    return result;
  }

  public static void main(String[] args) {
    Test3_03 test3_03 = new Test3_03();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println(test3_03.solution(n, k, arr));
  }
}
