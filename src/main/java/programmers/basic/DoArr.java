package programmers.basic;

import java.util.Arrays;

/**
 * 날짜: 2024/01/19
 * 내용: 코딩 기초 트레이닝_배열 조각하기
 */
public class DoArr {
    public int[] solution(int[] arr, int[] query) {

        for(int i=0; i<query.length; i++){
            if(i % 2 == 0){
                arr = Arrays.copyOfRange(arr,0,query[i]+1);
            }else{
                arr = Arrays.copyOfRange(arr,query[i],arr.length);
            }
        }
        return arr;
    }
}
