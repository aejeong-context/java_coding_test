import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test3_02 {
    public ArrayList<Integer> solution(int first, int[] firstArr, int second, int[] secondArr){
        ArrayList<Integer> result = new ArrayList<>();
        int pA = 0;
        int pB = 0;
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        while (pA<first && pB<second){
            if(firstArr[pA] == secondArr[pB]){
                result.add(firstArr[pA++]);
                pB++;
            }else if(firstArr[pA]<secondArr[pB]){
                pA++;
            }else{
                pB++;
            }

        }


        return result;
    }


    public static void main(String[] args) {
        Test3_02 main = new Test3_02();
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int[] firstArr = new int[firstNumber];
        for (int i = 0; i < firstNumber; i++) {
            firstArr[i] = sc.nextInt();
        }

        int secondNumber = sc.nextInt();
        int[] secondArr = new int[secondNumber];
        for (int i = 0; i < secondNumber; i++) {
            secondArr[i] = sc.nextInt();
        }

        for (int x : main.solution(firstNumber, firstArr, secondNumber, secondArr)) {
            System.out.print(x + " ");
        }
  }
}
