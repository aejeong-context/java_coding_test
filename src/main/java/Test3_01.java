import java.util.ArrayList;
import java.util.Scanner;

public class Test3_01 {

  public ArrayList<Integer> solution(int first, int[] firstArr, int second, int[] secondArr) {
    ArrayList<Integer> result = new ArrayList<>();
    int pointA = 0;
    int pointB = 0;
    while (first > pointA && second > pointB) {
      if (firstArr[pointA] < secondArr[pointB]) {
        result.add(firstArr[pointA++]);
      } else {
        result.add(secondArr[pointB++]);
      }
    }

    while (first > pointA) {
      result.add(firstArr[pointA++]);
    }
    while (second > pointB) {
      result.add(secondArr[pointB++]);
    }

    return result;
  }

  public static void main(String[] args) {
    Test3_01 main = new Test3_01();
    Scanner sc = new Scanner(System.in);
    int firstNumber = sc.nextInt();
    int[] firstArr = new int[firstNumber];
    for (int i = 0; i < firstNumber; i++) {
      firstArr[i] = sc.nextInt();
    }

    int secondNumber = sc.nextInt();
    int[] secondArr = new int[secondNumber];
    for (int i = 0; i < secondNumber; i++) {
      secondArr[i] = sc.nextInt();
    }

    for (int x : main.solution(firstNumber, firstArr, secondNumber, secondArr)) {
      System.out.print(x + " ");
    }
  }
}
