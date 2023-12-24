package programmers.basic;
/**
 * 날짜: 2023/12/24
 * 내용: 코딩 기초 트레이닝_수열과 구간 쿼리 3
 *
 *
 */
class Arr3 {
    public int[] arr3(int[] arr, int[][] queries) {

        int k = 0;

        for(int i =0; i<queries.length; i++){
            k = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = k;
        }
        return arr;
    }
}
