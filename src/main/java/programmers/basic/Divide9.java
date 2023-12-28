package programmers.basic;
/**
 * 날짜: 2023/12/27
 * 내용: 코딩 기초 트레이닝_9로 나눈 나머지
 *
 */
public class Divide9 {
    public int divide9(String number) {
        int answer = 0;
        int sum = 0;
        String[] num_list = number.split("");  // "123"-> ["1","2","3"]
        for(int i=0; i<num_list.length; i++){
            sum += Integer.parseInt(num_list[i]);
        }
        answer = sum % 9;
        return answer;
    }
}
