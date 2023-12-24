package programmers.basic;
/**
 * 날짜: 2023/12/24
 * 내용: 코딩 기초 트레이닝_수열과 구간 쿼리 2
 */
public class Arr2 {
    private static final int INF = 1000001;
    public int[] arr2(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int result = INF;
            for (int i = s; i <= e; i++) {
                if (arr[i] <= k || arr[i] >= result) continue;

                result = arr[i];
            }

            answer[idx++] = result == INF ? -1 : result;
        }

        return answer;
    }
}
