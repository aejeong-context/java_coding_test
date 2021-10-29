import java.util.ArrayList;
import java.util.Scanner;

public class Test2_08 {

  public ArrayList<Integer> solution(int[] numArray) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < numArray.length; i++) {
    int resultNumber = 1;
      for (int j = 0; j < numArray.length; j++) {
        if (numArray[i] < numArray[j]) {
          resultNumber++;
        }
      }
      result.add(resultNumber);
    }

    return result;
  }

  public static void main(String[] args) {
    Test2_08 main = new Test2_08();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] numberArray = new int[num];
    for (int i = 0; i < num; i++) {
      numberArray[i] = sc.nextInt();
    }
    for (int x : main.solution(numberArray)) {
      System.out.print(x + " ");
    }
  }
}
