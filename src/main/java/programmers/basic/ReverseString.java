package programmers.basic;
/**
 * 날짜: 2024/01/02
 * 내용: 코딩 기초 트레이닝_문자열 뒤집기
 */
class ReverseString {
    public String reverseString(String my_string, int s, int e) {

        StringBuilder sb = new StringBuilder(my_string);

        StringBuilder str = new StringBuilder(sb.substring(s, e+1));
        str.reverse();
        sb.replace(s, e+1, str.toString()); //start 부터 end 까지 str로 교체하기
        return sb.toString();

    }
}
