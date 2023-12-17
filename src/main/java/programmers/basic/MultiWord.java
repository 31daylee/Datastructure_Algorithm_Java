package programmers.basic;
/**
 * 날짜: 2023/12/18
 * 내용: 코딩 기초 트레이닝_문자열 곱하기
 * 출력할 내용 : "string" 	3	"stringstringstring"
 *
 */
class MultiWord {
    public String multiWord(String my_string, int k) {
        String answer = "";

        for(int i = 0; i< k; i++){
            answer += my_string;
        }
        return answer;
    }
}
