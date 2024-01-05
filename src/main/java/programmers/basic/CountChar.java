package programmers.basic;
/**
 * 날짜: 2024/01/04
 * 내용: 코딩 기초 트레이닝_문자 개수 세기
 */
class CountChar {
    public int[] countChar(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                answer[c-'A']++;
            }else if(c >='a' && c<='z'){
                answer[26+c-'a']++;
            }
        }
        return answer;
    }
}
