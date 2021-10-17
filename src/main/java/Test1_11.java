import java.util.Scanner;

public class Test1_11 {

  public String solution(String sentence) {
    String result = "";
    int cnt = 1;
    sentence = sentence + " ";

    for (int i = 0; i < sentence.length() - 1; i++) {
      if (sentence.charAt(i) == sentence.charAt(i + 1)) {
        cnt++;
      } else {
        result += sentence.charAt(i);
        if (cnt > 1) {
          result += String.valueOf(cnt);
          cnt = 1;
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Test1_11 main = new Test1_11();
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    System.out.println(main.solution(sentence));
  }
}
