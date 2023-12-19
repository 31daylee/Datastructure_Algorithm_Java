package programmers.basic;
/**
 * 날짜: 2023/12/19
 * 내용: 코딩 기초 트레이닝_공배수
 *
 */
class CommonMultiple {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if(number % n == 0  && number % m == 0 ){
            answer += 1;
        }

        return answer;
    }
}
