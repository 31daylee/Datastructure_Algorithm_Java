package programmers.basic;
/**
 * 날짜: 2023/12/19
 * 내용: 코딩 기초 트레이닝_홀짝에 따라 다른 값 반환하기
 *
 */
class OddOrEven2 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i<=n; i++){
            if(n%2 == 1 && i%2 ==1){
                answer += i;
            }else if(n%2 == 0 && i%2 == 0){
                answer += i * i;
            }
        }
        return answer;
    }
}
