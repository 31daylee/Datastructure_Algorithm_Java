package programmers.basic;

/**
 * 날짜: 2024/01/01
 * 내용: 코딩 기초 트레이닝_문자열의 앞의 n글자
 */
class FrontOfString {
    public String frontOfString(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0, n);
        return answer;
    }
}
