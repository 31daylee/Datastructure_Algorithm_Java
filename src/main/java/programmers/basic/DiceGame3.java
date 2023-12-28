package programmers.basic;

import java.util.Arrays;

/**
 * 날짜: 2023/12/27
 * 내용: 코딩 기초 트레이닝_주사위 게임 3
 *
 */
public class DiceGame3 {
    public static void main(String[] args) {
        DiceSolution s = new DiceSolution();
        int a = 4;
        int b = 1;
        int c = 4;
        int d = 4;
        s.dice(a,b,c,d);

    }
}
class DiceSolution{
    public int dice(int a, int b, int c, int d){
        int[] dice = {a,b,c,d};
        Arrays.sort(dice);

        int answer = 0;

        if(dice[0] == dice[3]){
            answer = 1111 * dice[0];
        }else if((dice[0] == dice[2] || dice[1] == dice[3])){ // 세 주사위의 값이 같으므로 dice[0] 혹은 dice[3] 의 값이 다르다
            answer = (int)Math.pow(10 * dice[1] + (dice[0] + dice[3] - dice[1]), 2); // dice[1]은 세 번의 주사위의 값에 항상 포함 되므로 이 값을 이용해 같은 값을 제외시킨다.
        }else if(dice[0] == dice[1] && dice[2] == dice[3]){
            answer = (dice[0] + dice[3]) * (dice[3]-dice[0]);
        }else if (dice[0] == dice[1]){
            answer = dice[2] * dice[3];
        }else if (dice[1] == dice[2]){
            answer = dice[0] * dice[3];
        }else if (dice[2] == dice[3]){
            answer = dice[0] * dice[1];
        }else{
            answer = dice[0];
        }
        System.out.println(answer);
        return answer;
    }
}
