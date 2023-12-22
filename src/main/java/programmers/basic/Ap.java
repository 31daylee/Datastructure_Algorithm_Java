package programmers.basic;
/**
 * 날짜: 2023/12/23
 * 내용: 코딩 기초 트레이닝_등차수열의 특정한 항만 더하기
 *
 */
class Solution2 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = a;

        for(int i =0; i<included.length; i++){
            if(included[i]){ // true인 경우만 조건절을 실행하기에 false일때의 제약이 필요없다.
                answer += num;
            }
            num += d; // 그 다음의 숫자(인덱스)를 위해 공차를 더해준다.
        }
        System.out.println(answer);
        return answer;
    }
}
public class Ap {
    public static void main(String[] ars) {
        Solution2 s = new Solution2();
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
        s.solution(a,d,included);
    }
}

