package programmers.basic;
/**
 * 날짜: 2023/12/23
 * 내용: 코딩 기초 트레이닝_코드 처리하기
 *
 */
class Solution {
    public String solution(String code) {
        // 조건1: mode 0 && i 가 짝수 -> code[i]
        // 조건2: mode 1 && i 가 홀수 -> code[i]
        // 조건3: code에 "1"이 있으면 mode changed
        String answer ="";
        int mode = 0;

        for(int i=0; i<code.length(); i++){
            if(code.charAt(i) == '1') mode = 1 - mode;
            else if(i%2 == mode ) answer += code.charAt(i);
        }
        System.out.println(answer);
        return answer.equals("") ? "EMPTY" : answer;

    }
}
public class HandleCode {
    public static void main(String[] ars) {
        Solution s = new Solution();
        String code = "abc1abcabc";
        s.solution(code);
    }
}
