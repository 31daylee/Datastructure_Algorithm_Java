package programmers.basic;
/**
 * 날짜: 2023/12/26
 * 내용: 코딩 기초 트레이닝_카운트업
 *
 */
public class CountUp {
    public int[] countUp(int start_num, int end_num) {

        int[] answer = new int[end_num-start_num+1];

        for(int i=0; i<=end_num-start_num; i++){
            answer[i] += i + start_num;
        }
        return answer;

    }
}
