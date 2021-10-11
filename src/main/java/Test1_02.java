
import java.util.Scanner;

public class Test1_02 {

  public String solution(String sentence){
    String result = "";
    for (char x : sentence.toCharArray()) {
      if (Character.isUpperCase(x)) {
        x = Character.toLowerCase(x);
      } else {
        x = Character.toUpperCase(x);
      }
      result =  result + x;
    }
    return result;
  }

  public static void main(String[] args) {
    Test1_02 main = new Test1_02();
    Scanner sc = new Scanner(System.in);
    String sentence = sc.next();
    System.out.println(main.solution(sentence));
  }
}
