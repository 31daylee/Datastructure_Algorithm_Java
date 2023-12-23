package programmers.basic;
/**
 * 날짜: 2023/12/23
 * 내용: 코딩 기초 트레이닝_이어 붙인 수
 * num_list	        result
 * [3, 4, 5, 2, 1]	393
 * [5, 7, 8, 3]	    581
 */
public class OddEven {
    public static void main(String[] args) {
        Test2 t = new Test2();
        int[] num_list = {3,4,5,2,1};
        t.test2(num_list);

    }
}
class Test2{
    public int test2(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                odd += String.valueOf(num_list[i]); // 이어 붙이기 위해 문자열로 만들기
            }else{
                even += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(odd)+Integer.parseInt(even); // 홀과 짝을 더할 때 정수로 더하기
        System.out.println(answer);
        return answer;

    }

}
