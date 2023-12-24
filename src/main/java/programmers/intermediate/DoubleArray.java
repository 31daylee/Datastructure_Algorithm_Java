package programmers.intermediate;
/**
 * 날짜: 2023/12/25
 * 내용: 코딩 테스트 입문_ 배열 두 배 만들기
 * 출력할 내용 :
    numbers	         result
    [1, 2, 3, 4, 5]	[2, 4, 6, 8, 10]
 */
public class DoubleArray {
    public int[] doubleArray(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}
