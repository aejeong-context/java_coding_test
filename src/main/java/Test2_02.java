import java.util.Scanner;

public class Test2_02 {

    public int solution(int[] students,int num){
        int result = 1;
        int tmp = students[0];
    for (int i = 1; i < num; i++) {
      if(tmp < students[i]){
          result++;
          tmp = students[i];
        System.out.println(tmp);
      }
    }

        return result;
    }
    public static void main(String[] args) {
    Test2_02 main = new Test2_02();
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
    int[] students = new int[num];
    for (int i = 0; i < num; i++){
        students[i] = sc.nextInt();
    }
    System.out.println(main.solution(students,num));
  }
}
