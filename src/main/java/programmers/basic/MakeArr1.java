package programmers.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 날짜: 2024/01/04
 * 내용: 코딩 기초 트레이닝_배열 만들기 1
 */
class MakeArr1 {
    public int[] makeArr1(int n, int k) {

        List<Integer> answer = new ArrayList<>();

        for(int i=1; i*k <=n; i++){
            answer.add(i*k);
        }
        int[] result = new int[answer.size()];
        for(int j=0; j<answer.size(); j++){
            result[j] = answer.get(j);
        }
        return result;

    }

}
