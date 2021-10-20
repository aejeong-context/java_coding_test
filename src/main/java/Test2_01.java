import java.util.ArrayList;
import java.util.Scanner;

public class Test2_01 {

  public ArrayList<Integer> solution(int[] numberArray) {
    ArrayList<Integer> result = new ArrayList<>();
    result.add(numberArray[0]);
    for (int i = 0; i < numberArray.length-1; i++) {
      if(numberArray[i]<numberArray[i+1]){
        result.add(numberArray[i+1]);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Test2_01 main = new Test2_01();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] numberArray = new int[num];
    for (int i = 0; i < num; i++) {
      numberArray[i] = sc.nextInt();
    }
    for (int n : main.solution(numberArray)) {
      System.out.print(n + " ");
    }
  }
}
