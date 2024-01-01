package programmers.basic;

import java.util.ArrayList;

/**
 * 날짜: 2024/01/01
 * 내용: 코딩 기초 트레이닝_배열 만들기5
 */
class MakeArr5 {
    public int[] makeArr5(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> result = new ArrayList<>(); // 배열문자열의 끝의 길이를 모르므로 동적배열 생성

        for(int i = 0; i < intStrs.length; i++){
            String answer = intStrs[i].substring(s,s+l);
            int intValue = Integer.parseInt(answer);
            if(intValue > k)
                result.add(intValue); // 배열리스트에 담기
        }
        // Integer -> int[] 변환(return 타입 )
        int[] resultArray = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            resultArray[i] =result.get(i);
        }
        return resultArray;

    }
}
