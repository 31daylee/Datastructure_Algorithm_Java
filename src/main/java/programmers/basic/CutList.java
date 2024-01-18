package programmers.basic;

import java.util.ArrayList;

/**
 * 날짜: 2024/01/18
 * 내용: 코딩 기초 트레이닝_리스트 자르기
 *
 */
public class CutList {
    public int[] solution(int n, int[] arr, int[] num_list) {
        ArrayList<Integer> result = new ArrayList<>();
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        if(n == 1){
            for(int i =0; i<b+1; i++){
                result.add(num_list[i]);
            }
        }else if(n == 2){
            for(int i =a; i<num_list.length; i++){
                result.add(num_list[i]);
            }
        }else if(n == 3){
            for(int i =a; i<b+1; i++){
                result.add(num_list[i]);
            }
        }else if(n == 4){
            for(int i =a; i<b+1; i += c){
                result.add(num_list[i]);
            }
        }
        int answer[] = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
