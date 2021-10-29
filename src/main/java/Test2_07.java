import java.util.Scanner;

public class Test2_07 {

  public int solution(int[] numberArray) {
    int result = 0;
    int tmp = 0;
    for (int i = 0; i < numberArray.length; i++) {
      if (numberArray[i] == 1) {
        tmp++;
        result += tmp;
      } else {
        tmp = 0;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Test2_07 main = new Test2_07();
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int[] numArray = new int[num];
    for (int i = 0; i < num; i++) {
      numArray[i] = sc.nextInt();
    }
    System.out.println(main.solution(numArray));
  }
}
