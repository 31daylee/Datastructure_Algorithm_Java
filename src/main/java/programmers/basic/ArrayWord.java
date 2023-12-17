package programmers.basic;
/**
 * 날짜: 2023/12/18
 * 내용: 코딩 기초 트레이닝_문자 리스트를 문자열로 변환하기
 * 출력할 내용 : ["a","b","c"]	"abc"
 *
 */
class ArrayWord {
    public String arrayWord(String[] arr) {
        String answer = "";

        for(int i = 0; i< arr.length; i++){ // length 는 배열의 길이/ length()는 문자열길이
            answer += arr[i];
        }

        return answer;
    }
}
