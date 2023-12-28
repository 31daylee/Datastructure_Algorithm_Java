package programmers.basic;

import java.util.ArrayList;
/**
 * 날짜: 2023/12/27
 * 내용: 코딩 기초 트레이닝_배열 만들기 4
 *
 */
public class MakeArr4 {
    public int[] makeArr4(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(); // 배열리스트 만들기

        int i = 0;
        while(i < arr.length){
            if(list.size() == 0){ // 배열이 비어 있으면
                list.add(arr[i]);
                i += 1;
            }else{
                int last = list.get(list.size()-1); // list에 있는 마지막 수
                if(list.size() != 0 && last < arr[i]){
                    list.add(arr[i]);
                    i +=1;
                }else if(list.size() != 0 && last >= arr[i]){
                    list.remove(list.size()-1);
                }

            }
        }
        int[] answer = new int[list.size()];
        for(int j =0; j< list.size(); j++){
            answer[j] = list.get(j);

        }
        return answer;

    }
}
