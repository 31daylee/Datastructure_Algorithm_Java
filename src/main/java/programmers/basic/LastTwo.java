package programmers.basic;
/**
 * 날짜: 2023/12/24
 * 내용: 코딩 기초 트레이닝_마지막 두원소
 *
 */
public class LastTwo {
    public static void main(String[] args) {
        Test3 t = new Test3();
        int[] num_list = {5, 2, 1, 7, 5};
        t.test3(num_list);
    }
}

class Test3{
    public int[] test3(int[] num_list) {
        int[] answer = new int[num_list.length +1]; // 새로운 배열을 생성한다. 중요한 점은 +1 하여 길이를 확장하는 것.
        int last = 0;

        if(num_list[num_list.length-1] > num_list[num_list.length-2] ){
            last = num_list[num_list.length-1] - num_list[num_list.length-2];
        }else{
            last = num_list[num_list.length-1] * 2;
        }

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i]; // [5, 2, 1, 7, 5] 가 배열 안에 들어가 있다
        }
        answer[answer.length - 1] = last; // last = 10 을 answer 배열 마지막에 넣어준다.

        return answer;
    }
}