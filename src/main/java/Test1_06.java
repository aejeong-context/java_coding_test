import java.util.Scanner;

public class Test1_06 {
  public String solution(String sentence) {
    String result = "";
    for (int i = 0; i < sentence.length(); i++) {
      if (i == sentence.indexOf(sentence.charAt(i))) {
        result += sentence.charAt(i);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Test1_06 main = new Test1_06();
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    System.out.println(main.solution(sentence));
  }
}
