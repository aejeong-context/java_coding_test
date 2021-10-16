import java.util.Scanner;

public class Test1_09 {

  public int solution(String sentence) {
    String result = "";
    for (int i = 0; i < sentence.length(); i++) {
      if (!Character.isAlphabetic(sentence.charAt(i))) {
        result += sentence.charAt(i);
      }
    }

    return Integer.parseInt(result);
  }

  public static void main(String[] args) {
    Test1_09 main = new Test1_09();
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    System.out.println(main.solution(sentence));
  }
}
