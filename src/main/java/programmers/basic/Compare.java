package programmers.basic;
/**
 * 날짜: 2023/12/18
 * 내용: 코딩 기초 트레이닝_두 수의 연산값 비교하기
 * 출력할 내용 : 2	91	364
 *
 */
class Compare {
    public int solution(int a, int b) {
        int answer = 0;

        String ab =String.valueOf(a) + String.valueOf(b); // 숫자를 문자열로 만들기
        int abValue = Integer.parseInt(ab); // 다시 숫자로 만들기
        int axbValue = a* b * 2;

        if(abValue > axbValue){
            answer += abValue;
        }else{
            answer += axbValue;
        }


        return answer;
    }
}
