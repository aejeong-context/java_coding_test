import java.util.ArrayList;
import java.util.Scanner;

public class Test2_06 {

  public boolean isPrime(int num) {
    if (num == 1) return false;
    for (int i = 2; i < num / 2; i++) {
      if (num % i == 0) return false;
    }
    return true;
  }

  public ArrayList<Integer> solution(int[] numberArray) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < numberArray.length; i++) {
      int number = 0;
      while (numberArray[i] > 0) {
        number = number * 10 + numberArray[i] % 10;
        numberArray[i] /= 10;
      }
      if (isPrime(number)) result.add(number);
    }

    return result;
  }

  public static void main(String[] args) {
    Test2_06 main = new Test2_06();
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int[] numberArray = new int[number];
    for (int i = 0; i < number; i++) {
      numberArray[i] = sc.nextInt();
    }
    for (int x : main.solution(numberArray)) {
      System.out.print(x + " ");
    }
  }
}
