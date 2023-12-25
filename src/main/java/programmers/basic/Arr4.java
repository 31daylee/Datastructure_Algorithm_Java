package programmers.basic;
/**
 * 날짜: 2023/12/25
 * 내용: 코딩 기초 트레이닝_수열과 구간 쿼리 4
 */
public class Arr4 {
    public int[] arr4(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j <= queries[i][1]; j++){
                if(j % queries[i][2] == 0)
                    arr[j]++;
            }
        }
        return arr;
    }
}
