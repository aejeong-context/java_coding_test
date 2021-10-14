import java.util.Scanner;

public class Test1_07 {

  public String solution(String sentence) {
    String result = "NO";

    // 1번째
    //    sentence = sentence.toLowerCase();
    //    int len = sentence.length();
    //    for (int i = 0; i < len; i++) {
    //      if (sentence.charAt(i) != sentence.charAt(len - i - 1)) {
    //        return "NO";
    //      }
    //      return result;
    //    }

    // 2번째
    //    char[] ch = sentence.toCharArray();
    //    int le = 0;
    //    int ri = ch.length - 1;
    //
    //    while (le < ri) {
    //      if (!(ch[le] == ch[ri])) {
    //        result = "NO";
    //        return result;
    //      }
    //      le++;
    //      ri--;
    //      result = "YES";
    //    }

    // 3번째
    String tmp = new StringBuilder(sentence).reverse().toString();
    if (sentence.equalsIgnoreCase(tmp)) {
      result = "YES";
    }
    return result;
  }

  public static void main(String[] args) {
    Test1_07 main = new Test1_07();
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    System.out.println(main.solution(sentence));
  }
}
