import java.util.ArrayList;
import java.util.Scanner;

public class Test1_04 {

  public ArrayList<String> solution(String[] stringArray) {

    ArrayList<String> arrayList = new ArrayList<>();

    for (String x : stringArray) {

      char[] ch = x.toCharArray();

      // 짝수일 때
      int p = 0;
      int m = ch.length - 1;
      if (ch.length % 2 == 0) {
        while (p < m) {
          char tmp = ch[m];
          ch[m] = ch[p];
          ch[p] = tmp;
          p++;
          m--;
        }
        // 홀수일 때
      } else {
        while (p != m) {
          char tmp = ch[m];
          ch[m] = ch[p];
          ch[p] = tmp;
          p++;
          m--;
        }
      }
      arrayList.add(String.valueOf(ch));
    }

    return arrayList;
  }

  public static void main(String[] args) {
    Test1_04 main = new Test1_04();
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    String[] str = new String[number];
    for (int i = 0; i < str.length; i++) {
      str[i] = sc.next();
    }
    for (String x : main.solution(str)) {
      System.out.println(x);
    }
  }
}
