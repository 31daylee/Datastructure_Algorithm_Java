package programmers.basic;

/**
 * 날짜: 2023/12/17
 * 내용: 코딩 기초 트레이닝_문자열 겹쳐쓰기
 * 출력할 내용 : 예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.
 *
 */
class Overwrite {
    public String overwrite(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer = my_string.substring(0,s);
        answer += overwrite_string;
        answer += my_string.substring(s+overwrite_string.length(), my_string.length());

        return answer;
    }
}
