package programmers.basic;
/**
 * 날짜: 2024/01/01
 * 내용: 코딩 기초 트레이닝_부분 문자열에 이어 붙여 문자열 만들기
 */
public class PartsString {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i = 0; i< my_strings.length; i++){
            String str = my_strings[i]; // 문자열로 받기
            answer += str.substring(parts[i][0], parts[i][1]+1); // parts에 해당하는 길이만큼 자른 후 answer 에 붙이기
        }
        return answer;
    }
}
