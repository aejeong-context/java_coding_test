import java.util.Scanner;

public class Test1_01 {

  public int solution(String str, char ch) {
    int answer = 0;
    str = str.toUpperCase();
    ch = Character.toUpperCase(ch);

//    for (int i = 0; i < str.length(); i++) {
//      if (str.charAt(i) == ch) {
//        answer++;
//      }
//    }

    for(char x : str.toCharArray()){
      if(x == ch){
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Test1_01 test1_01 = new Test1_01();
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    char ch = scanner.next().charAt(0);
    System.out.println(test1_01.solution(str, ch));
  }
}
