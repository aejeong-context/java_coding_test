import java.util.Scanner;

public class Test2_09 {

  public int solution(int[][] numberArray, int number) {
    int result = 0;
    int x, y;

    for (int i = 0; i < number; i++) {
      x = y = 0;
      for (int j = 0; j < number; j++) {
        x += numberArray[i][j];
        y += numberArray[j][i];
      }
      result = Math.max(result, x);
      result = Math.max(result, y);
    }
    x = y = 0;
    for (int i = 0; i < number; i++) {
      x += numberArray[i][i];
      y += numberArray[i][number - i - 1];
    }
    result = Math.max(result, x);
    result = Math.max(result, y);

    return result;
  }

  public static void main(String[] args) {
    Test2_09 main = new Test2_09();
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int[][] numberArray = new int[number][number];
    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number; j++) {
        numberArray[i][j] = sc.nextInt();
      }
    }
    System.out.println(main.solution(numberArray, number));
  }
}
