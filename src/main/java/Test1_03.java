import java.util.Scanner;

public class Test1_03 {

  public String solution(String sentence) {

    //    String[] world = sentence.split(" ");
    //    for (String x : world) {
    //      if (result.length() < x.length()) {
    //        result = x;
    //      }
    //    }

    String result = "";
    int position = Integer.MIN_VALUE;
    // 공백이 없을 때 까지 실행
    while ((position = sentence.indexOf(" ")) != -1) {
      String world = sentence.substring(0, position);
      if (world.length() > result.length()) {
        result = world;
      }
      sentence = sentence.substring(position + 1);
    }

    if (sentence.length() > result.length()) result = sentence;
    return result;
  }

  public static void main(String[] args) {
    Test1_03 main = new Test1_03();
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    System.out.println(main.solution(sentence));
  }
}
