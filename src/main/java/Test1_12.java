import java.util.Scanner;

public class Test1_12 {
  public String solution(int cnt, String sentence) {
    String result = "";
    for (int i = 0; i <cnt; i++) {
      String tmp = sentence.substring(0,7).replace("#","1").replace("*","0");
      int toParse = Integer.parseInt(tmp,2);
      result +=(char)toParse;
      sentence = sentence.substring(7);

    }

    return result;
  }

  public static void main(String[] args) {
    Test1_12 main = new Test1_12();
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    String sentence = sc.next();
    System.out.println(main.solution(cnt, sentence));
  }
}
