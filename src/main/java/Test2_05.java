import java.util.Scanner;

public class Test2_05 {
  public int solution(int number) {
    int result = 0;
    int[] ch = new int[number + 1];

    for (int i = 2; i <= number; i++) {
      // 2는 소수 이므로 미리 추가
      if (ch[i] == 0) {
        result++;
        // 배수를 돌면서 검사
        for(int j=i;j<=number;j=j+i){
          ch[j] = 1;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Test2_05 main = new Test2_05();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(main.solution(num));
  }
}
