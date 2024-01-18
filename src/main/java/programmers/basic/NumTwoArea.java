package programmers.basic;

import java.util.Arrays;
/**
 * 날짜: 2024/01/18
 * 내용: 코딩 기초 트레이닝_2의 영역
 *
 */
public class NumTwoArea {
    public int[] numTwoArea(int[] arr) {
        int min = 100000, max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        if(min <= max){
            return Arrays.copyOfRange(arr, min, max+1);
        }
        return new int[]{-1};

    }
}
