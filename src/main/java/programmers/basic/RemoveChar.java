package programmers.basic;
/**
 * 날짜: 2024/01/04
 * 내용: 코딩 기초 트레이닝_글자 지우기
 */
class RemoveChar {
    public String removeChar(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split(""); // 문자열을 배열로 변환

        for(int i=0; i<indices.length; i++){
            tmp[indices[i]] = ""; // 해당하는 인덱스의 값을 ""로 초기화
        }
        for(String x : tmp){
            answer += x; // 문자열에 문자 추가
        }
        return answer;
    }
}
