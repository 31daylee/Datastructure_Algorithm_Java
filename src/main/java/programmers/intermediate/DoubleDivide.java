package programmers.intermediate;
/**
 * 날짜: 2023/12/25
 * 내용: 코딩 테스트 입문_ 두 수의 나눗셈
 * 출력할 내용 :
 * num1   num2	    result
 * 3	  2	         1500
 * 7	  3	         2333
 * 1	 16	         62
 *
 */
class DoubleDivide {
    public int doubleDivide(int num1, int num2) {
        double result = (double)num1/ num2* 1000;
        return (int) result ;
    }
}
