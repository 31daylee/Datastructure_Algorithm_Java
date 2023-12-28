package programmers.basic;

import java.util.ArrayList;
/**
 * 날짜: 2023/12/27
 * 내용: 코딩 기초 트레이닝_콜라츠 수열 만들기
 *
 */
class Collatz {
    public int[] collatz(int n) {
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(n);

        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = 3 * n +1;
            }
            resultList.add(n);
        }

        int[] answer = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++){
            answer[i] += resultList.get(i);
        }return answer;
    }
}
