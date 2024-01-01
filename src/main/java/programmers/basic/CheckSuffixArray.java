package programmers.basic;
/**
 * 날짜: 2024/01/01
 * 내용: 코딩 기초 트레이닝_접미사인지 확인하기
 */
class CheckSuffixArray {
    public int checkSuffixArray(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.endsWith(is_suffix)){ // endsWith 사용하기
            answer = 1;
        }
        return answer;
    }
}
