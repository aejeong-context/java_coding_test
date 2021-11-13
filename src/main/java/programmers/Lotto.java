package programmers;

import java.util.Arrays;

public class Lotto {

  public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = new int[2];
    int[] level = {6,6,5,4,3,2,1};
    int cnt = 0;
    int win_cnt = 0;
    for (int i = 0; i < win_nums.length; i++) {
      for (int j = 0; j < lottos.length; j++) {
        if (win_nums[i] == lottos[j]) {
          cnt++;
        }
      }
      if (lottos[i] == 0) {
        win_cnt++;
      }
    }

    answer[0] = level[cnt + win_cnt];
    answer[1] = level[cnt];

    return answer;
  }

  public static void main(String[] args) {
    Lotto main = new Lotto();
    int[] win_num = {20, 9, 3, 45, 4, 35};
    int[] lottos = {45, 4, 35, 20, 3, 9};
    for (int x : main.solution(lottos, win_num)) {
      System.out.print(x);
    }
  }
}
