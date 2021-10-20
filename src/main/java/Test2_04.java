import java.util.ArrayList;
import java.util.Scanner;

public class Test2_04 {
  public ArrayList<Integer> solution(int num) {
    ArrayList<Integer> result  = new ArrayList<>();
    result.add(1);
    result.add(1);

    for (int i = 1; i < num-1; i++) {
      result.add(result.get(i - 1) + result.get(i));
    }

    return result;
  }

  public static void main(String[] args) {
    Test2_04 main = new Test2_04();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int x : main.solution(num)) {
      System.out.print(x + " ");
    }
  }
}
