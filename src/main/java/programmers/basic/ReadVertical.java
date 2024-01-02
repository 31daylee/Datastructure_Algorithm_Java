package programmers.basic;
/**
 * 날짜: 2024/01/02
 * 내용: 코딩 기초 트레이닝_세로읽기
 */
class ReadVertical {
    public String readVertical(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        int startIndex = c-1; // 인덱스 번호

        while(startIndex < my_string.length()){
            sb.append(my_string.charAt(startIndex)); // 해당하는 인덱스의 글자만 출력
            startIndex += m; // 차이만큼 더해주기 
        }
        return sb.toString();
    }
}
