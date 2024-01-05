package programmers.basic;
/**
 * 날짜: 2024/01/04
 * 내용: 코딩 기초 트레이닝_가까운 1찾기
 */
class FindOne {
    public int findOne(int[] arr, int idx) {
        int answer = 0;
        for(int i =0; i<arr.length; i++){
            if(i >= idx && arr[i] == 1){
                answer = i;
                break;
            }else{
                answer = -1;
            }

        }
        return answer;
    }
}
