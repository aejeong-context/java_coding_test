import java.util.Scanner;

public class Test3_04 {

  public static int solution(int n, int m, int[] arr) {
    int sum = 0;
    int lt = 0;
    int result = 0;

    for (int rt = 0; rt < n; rt++) {
      // 초기화
      sum += arr[rt];
      while (sum > m) sum -= arr[lt++];
      if (sum == m) result++;
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.print(solution(n, m, arr));
  }
}
