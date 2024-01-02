package programmers.basic;
/**
 * 날짜: 2024/01/02
 * 내용: 코딩 기초 트레이닝_접두사인지 확인
 */
class CheckPrefix {
    public int checkPrefix(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        }

        return answer;
    }
}
