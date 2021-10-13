import java.util.Scanner;

public class Test1_05 {

  public String solution(String sentence) {
    String result = "";
    char[] ch = sentence.toCharArray();

    int le = 0;
    int ri = ch.length - 1;

    while (le < ri) {

      if(!Character.isAlphabetic(ch[le])){
        le++;
      }else if(!Character.isAlphabetic(ch[ri])){
        ri--;
      }else{
        char tmp = ch[le];
        ch[le] = ch[ri];
        ch[ri] = tmp;
        le++;
        ri--;
      }

    }

    result = String.valueOf(ch);

    return result;
  }

  public static void main(String[] args) {
    Test1_05 main = new Test1_05();
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();

    System.out.println(main.solution(sentence));
  }
}
