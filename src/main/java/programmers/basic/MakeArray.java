package programmers.basic;
import java.util.ArrayList;

/**
 * 날짜: 2023/12/25
 * 내용: 코딩 기초 트레이닝_배열 만들기2
 */
public class MakeArray {
    public int[] makeArray(int l, int r) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = l; i<=r; i++){
            if(String.valueOf(i).matches("[05]+")){ // 0 또는 5로 이루어진 하나 이상의 숫자
                result.add(i);
            }
        }
        if(result.isEmpty()){
            return new int[]{-1}; // -1을 포함한 크기가 1인 배열 반환
        }

        int[] resultArray = new int[result.size()]; // ArrayList 크기에 맞게 배열 생성
        for(int i=0; i<result.size(); i++){
            resultArray[i] += result.get(i);
        }
        return resultArray;
    }
}
