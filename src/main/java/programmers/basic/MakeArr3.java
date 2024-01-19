package programmers.basic;

import java.util.ArrayList;

/**
 * 날짜: 2024/01/19
 * 내용: 코딩 기초 트레이닝_배열 만들기 3
 */
public class MakeArr3 {
    public int[] makeArr3(int[] arr, int[][] intervals) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++) result.add(arr[j]);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
