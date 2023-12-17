package programmers.basic;
/**
 * 날짜: 2023/12/18
 * 내용: 코딩 기초 트레이닝_더 크게 합치기
 * 출력할 내용 : 9	91	991
 *
 */
class MoreBig {
    public int solution(int a, int b) {
        int answer = 0;

        String ab = String.valueOf(a) + String.valueOf(b); // String으로 변환
        String ba = String.valueOf(b) + String.valueOf(a);

        int abValue = Integer.parseInt(ab); // Integer로 변환
        int baValue = Integer.parseInt(ba);

        if(abValue > baValue){  // 비교
            answer += abValue;
        }else{
            answer += baValue;
        }
        return answer;
    }
}
