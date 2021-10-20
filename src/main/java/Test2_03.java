import java.util.ArrayList;
import java.util.Scanner;

public class Test2_03 {

  public ArrayList<String> solution(int[] a, int[] b, int num) {
    ArrayList<String> result = new ArrayList<>();
    for (int i = 0; i < num; i++) {
        if(a[i] == b[i]){
            result.add("D");
        }else if(a[i] == 2 && b[i] <= 1){
            result.add("A");
        }else if(a[i]==3 && b[i] >=2){
            result.add("A");
        }else if(a[i] == 1 && b[i]>=3){
            result.add("A");
        }else{
            result.add("B");
        }
    }
    return result;
  }

  public static void main(String[] args) {
    Test2_03 main = new Test2_03();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] a = new int[num];
    int[] b = new int[num];
    for (int i = 0; i < num; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < num; i++) {
      b[i] = sc.nextInt();
    }

    for (String x : main.solution(a,b,num)){
      System.out.println(x);
    }
  }
}
