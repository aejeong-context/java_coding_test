import java.util.Scanner;

public class Test2_12 {

  public int solution(int st, int test, int[][] arr) {
    int result = 0;
    // 학생 수 만큼 -> 1번 부터 시작 (학생번호)
    for (int i = 1; i <= st; i++) {
      for (int j = 1; j <= st; j++) {
        int count = 0;
        // 테스트 수 만큼
        for (int k = 0; k < test; k++) {
          int positionI = 0,positionJ = 0;
          // 등 수 만큼(학생 수)
          for (int s = 0; s < st; s++) {
            // 해당 위치에 본인 번호가 있으면 본인은 s등 이다.
            if (arr[k][s] == i) positionI = s;
            if (arr[k][s] == j) positionJ = s;
          }
          if (positionI < positionJ) count++;
          System.out.println(count);
        }
        if (count == test) result++;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Test2_12 main = new Test2_12();
    Scanner sc = new Scanner(System.in);
    int student = sc.nextInt();
    int testNumber = sc.nextInt();
    int[][] arr = new int[testNumber][student];
    for (int i = 0; i < testNumber; i++) {
      for (int j = 0; j < student; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println(main.solution(student, testNumber, arr));
  }
}
