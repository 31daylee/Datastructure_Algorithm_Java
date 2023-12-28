package programmers.basic;
/**
 * 날짜: 2023/12/27
 * 내용: 코딩 기초 트레이닝_글자 이어 붙여 문자열 만들기
 *
 */
public class WordString {
    public String wordString(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder(); // 조립을 위해 StringBuilder 활용

        for(int index : index_list){ // index_list에 있는 인덱스 번호를 출력
            answer.append(my_string.charAt(index)); // 해당 인덱스의 문자를 출력 후 answer 에 저장 //charAt(1) ->
        }
        return answer.toString(); // 문자열로 변환
    }
}
