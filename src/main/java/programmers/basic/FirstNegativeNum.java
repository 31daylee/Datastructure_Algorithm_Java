package programmers.basic;
/**
 * 날짜: 2024/01/18
 * 내용: 코딩 기초 트레이닝_첫 번째로 나오는 음수
 *
 */
public class FirstNegativeNum {
    public int firstNegativeNum(int[] num_list) {
        int answer = -1;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }
        return answer;

    }
}
