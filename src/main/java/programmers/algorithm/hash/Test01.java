package programmers.algorithm.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 날짜: 2024/01/01
 * 내용: 코딩 기초 트레이닝_해시_완주하지 못한 선수
 */
class Test01 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> map = new HashMap<>();
        for(String player : participant){
            map.put(player, map.getOrDefault(player,0)+1); // player가 존재하면 1 counting
        }
        for(String player : completion){
            map.put(player, map.get(player)-1); // 존재하는 player(=completed player, 완주자) -1 counting
        }
        Iterator<Map.Entry<String, Integer>> result = map.entrySet().iterator(); // iterator + entrySet 으로 반복문 작업
        while(result.hasNext()){
            Map.Entry<String, Integer> entry = result.next();
            if(entry.getValue() != 0){ // 완주자가 아닌 경우엔 0 이 아니다 (카운팅에서 제외되지 못함)
                answer = entry.getKey(); // 완주하지 못한 선수 이름 출력
            }
        }
        return answer;
    }
}
