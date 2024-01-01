package programmers.basic;
/**
 * 날짜: 2024/01/01
 * 내용: 코딩 기초 트레이닝_문자열의 뒤의 n글자
 */
class EndsOfString {
    public String endsOfString(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n,my_string.length());
        return answer;
    }
}
