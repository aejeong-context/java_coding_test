import java.util.Scanner;

public class Test1_09 {

  public int solution(String sentence) {
    int result = 0;
//    for (int i = 0; i < sentence.length(); i++) {
//      if (Character.isDigit(sentence.charAt(i))) {
//        result += sentence.charAt(i);
//      }
//    }
    char[] ch = sentence.toCharArray();

    for(char x : ch){
      // 아스키 코드 48 ~ 57 이 숫자
      if(x>=48 && x<=57){
        result = result * 10 +(x-48);

      }
    }

    return result;
  }

  public static void main(String[] args) {
    Test1_09 main = new Test1_09();
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    System.out.println(main.solution(sentence));
  }
}
