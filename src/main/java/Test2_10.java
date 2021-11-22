import java.util.Scanner;

public class Test2_10 {

  public int solution(int[][] numberArray, int num) {
    // 상하좌우
    int[] x = {-1, 0, 1, 0};
    int[] y = {0, 1, 0, -1};
    int result = 0;

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        boolean check = true;
        for (int k = 0; k < 4; k++) {
          int targetX = i + x[k];
          int targetY = j + y[k];
          if (targetX >= 0
              && targetX < num
              && targetY >= 0
              && targetY < num
              && numberArray[i][j] <= numberArray[targetX][targetY]) {
            check = false;
            break;
          }
        }
        if (check) result++;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Test2_10 main = new Test2_10();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[][] numberArray = new int[num][num];
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        numberArray[i][j] = sc.nextInt();
      }
    }
    System.out.println(main.solution(numberArray, num));
  }
}
