package programmers.intermediate;
/**
 * 날짜: 2023/12/25
 * 내용: 코딩 테스트 입문_ 분수의 덧셈
 */
class Fraction {
    public int[] fraction(int numer1, int denom1, int numer2, int denom2) {

        int upNum = (numer1*denom2)+(numer2*denom1);
        int downNum = denom1* denom2;

        int max = 1;
        for(int i = 1; i<=upNum && i<=downNum; i++){
            if(upNum % i == 0 && downNum % i ==0){
                max = i;
            }
        }
        upNum = upNum/max;
        downNum = downNum/max;

        int[] answer = {upNum,downNum};
        return answer;
    }
}
