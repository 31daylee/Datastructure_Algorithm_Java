package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 날짜: 2024/01/01
 * 내용: 코딩 기초 트레이닝_접미사 배열
 */
class SuffixArray {
    public String[] suffixArray(String my_string) {
        ArrayList<String> array = new ArrayList<>(); // 길이가 정해져 있으므로 동적 배열을 사용 안하는 방향으로 가자

        for(int i = 0; i < my_string.length(); i++){
            array.add(my_string.substring(i, my_string.length()));
        }

        String[] strArr = array.toArray(new String[array.size()]); // toArray() 사용하면 동적->정적 배열 리스트 변환 가능
        Arrays.sort(strArr); // 오름차순 정렬
        return strArr;

    }
}
