package programmers.basic;
/**
 * 날짜: 2024/01/04
 * 내용: 코딩 기초 트레이닝_카운트 다운
 */
class CountDown {
    public int[] countDown(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        int start_num = start;

        for(int i=0; i<start-end_num+1; i++){
            answer[i] += start_num;
            start_num--;
        }
        return answer;
    }
}
