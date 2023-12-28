package programmers.basic;
/**
 * 날짜: 2023/12/27
 * 내용: 코딩 기초 트레이닝_문자열 여러 번 뒤집기
 *
 */
class ReverseWord {
    public String reverseWord(String my_string, int[][] queries) {
        StringBuilder result = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            StringBuilder str = new StringBuilder(result.substring(start, end + 1));
            // subString(처음(포함), 끝(제외)) 이므로 end+1함으로써 end도 포함됨
            str.reverse();
            result.replace(start, end + 1, str.toString()); // start부터 end+1까지, str.toString()으로 대체
        }

        return result.toString(); // StringBuilder타입을 String 타입으로 반환

    }
}
