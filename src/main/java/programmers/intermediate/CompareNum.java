package programmers.intermediate;
/**
 * 날짜: 2023/12/25
 * 내용: 코딩 테스트 입문_ 숫자 비교하기
 * 출력할 내용 :
 * num1   num2	  result
    2	  3	      -1
    11	  11	   1
    7	  99	  -1
 *
 */
class CompareNum {
    public int compareNum(int num1, int num2) {
        if(num1 == num2){
            return 1;
        }else{
            return -1;
        }
    }
}
