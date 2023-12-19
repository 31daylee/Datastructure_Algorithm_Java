package programmers.basic;
/**
 * 날짜: 2023/12/19
 * 내용: 코딩 기초 트레이닝_n의 배수
 *
 */
class MulipleN {
    public int solution(int num, int n) {
        int answer = 0;

        if(num % n == 0){
            answer += 1;
        }
        return answer;
    }
}
