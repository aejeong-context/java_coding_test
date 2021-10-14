import java.util.Scanner;

public class Test1_08 {
  public String solution(String sentence) {
    String result = "NO";

    sentence = sentence.toUpperCase().replaceAll("[^A-Z]", "");
    String str = new StringBuilder(sentence).reverse().toString();
    if (sentence.equals(str)) {
      return "YES";
    }

    // 1번째
    //    char[] ch = sentence.toUpperCase().toCharArray();
    //    int le = 0;
    //    int ri = ch.length-1;
    //    while(le<ri){
    //      if(!Character.isAlphabetic(ch[le])){
    //        le++;
    //      }else if(!Character.isAlphabetic(ch[ri])){
    //        ri--;
    //      }else if(!(ch[le] == ch[ri])){
    //        result = "NO";
    //        return result;
    //      }else{
    //        le++;
    //        ri--;
    //      }
    //      result = "YES";
    //    }

    return result;
  }

  public static void main(String[] args) {
    Test1_08 main = new Test1_08();
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    System.out.println(main.solution(sentence));
  }
}
