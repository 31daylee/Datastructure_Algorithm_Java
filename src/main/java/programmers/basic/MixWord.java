package programmers.basic;
/**
 * 날짜: 2023/12/18
 * 내용: 코딩 기초 트레이닝_문자열 섞기
 * 출력할 내용 : "aaaaa"	"bbbbb"	=> "ababababab"
 *
 */
class MixWord {
    public String mixWord(String str1, String str2) {
        String answer = "";

        for(int i = 0; i< str1.length(); i++){
            answer += String.valueOf(str1.charAt(i))+ str2.charAt(i);
        }
        return answer;
    }
}
