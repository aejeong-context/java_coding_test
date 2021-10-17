import java.util.Scanner;

public class Test1_10 {
  public int[] solution(String s, char t) {
    int[] result = new int[s.length()];

    int tmp = 1000;

    // 왼쪽으로 부터 떨어진 거리를 구한다.
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == t) {
        tmp = 0;
      } else {
        tmp++;
      }
      result[i] = tmp;
    }

    // 오른쪽으로 부터 떨어진 거리를 구한다.
    tmp = 1000;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == t) {
        tmp = 0;
      } else if(result[i]>tmp){
        // 둘중 작은 숫자 대입
        result[i] =tmp;
      }
        tmp++;
    }

    return result;
  }

  public static void main(String[] args) {
    Test1_10 main = new Test1_10();
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char t = sc.next().charAt(0);
    for (int x : main.solution(s, t)) {
      System.out.print(x);
    }
  }
}
