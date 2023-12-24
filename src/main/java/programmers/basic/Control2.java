package programmers.basic;
/**
 * 날짜: 2023/12/24
 * 내용: 코딩 기초 트레이닝_수 조작하기2
 *
 */
public class Control2 {
    public static void main(String[] args) {
        Test5 t = new Test5();
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        t.test5(numLog);
    }
}
class Test5{
    public String test5(int[] numLog) {

        StringBuilder result = new StringBuilder(); // StringBuilder 객체 선언

        for(int i= 0; i<numLog.length; i++){
            if(i > 0){
                int diff = numLog[i] - numLog[i-1]; // 두 값의 차이
                if(diff == 1){
                    result.append("w"); // append로 문자열 추가
                }else if(diff == -1){
                    result.append("s");
                }else if(diff == 10){
                    result.append("d");
                }else if(diff == -10){
                    result.append("a");
                }
            }
        }
        System.out.println(result.toString());
        return result.toString();   // 문자열 변환
    }

}
