import java.util.Scanner;

public class Test2_11 {

  public int solution(int number, int[][] numberArray) {
    int result = 0;
    int max = 0;
    for (int i = 1; i <=number; i++) {
      int count = 0;
      for (int j = 1; j <= number; j++) {
        for (int k = 1; k <= 5; k++) {
          if (numberArray[i][k] == numberArray[j][k]) {
            count++;
            break;
          }
        }
      }
      if (max < count) {
        max = count;
        result = i;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Test2_11 main = new Test2_11();
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int[][] array = new int[number + 1][6];
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= 5; j++) {
        array[i][j] = sc.nextInt();
      }
    }
    System.out.println(main.solution(number, array));
  }
}
