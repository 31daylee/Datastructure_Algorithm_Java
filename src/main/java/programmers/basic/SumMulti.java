package programmers.basic;
/**
 * 날짜: 2023/12/23
 * 내용: 코딩 기초 트레이닝_원소들의 곱과 합
 * num_list	        result
 * [3, 4, 5, 2, 1]	1
 * [5, 7, 8, 3]	    0
 */
public class SumMulti {
    public static void main(String[] args) {
        Test t = new Test();
        int[] num_list = {3,4,5,2,1};
        t.test(num_list);

    }
}
class Test{
    public int test(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1; // 곱이므로 0이 아닌 1로 초기화 !!

        for(int i=0; i<num_list.length; i++){
            sum += num_list[i];
            mul *= num_list[i];
        }if(mul < sum * sum){
            answer = 1;
        }
        System.out.println(answer);
        return answer;
    }
}
