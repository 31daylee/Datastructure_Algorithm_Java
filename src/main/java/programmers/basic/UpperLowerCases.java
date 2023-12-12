package programmers.basic;

import java.util.Scanner;

/**
 * 날짜: 2023/12/13
 * 내용: 코딩 기초 트레이닝_대소문자 바꿔서 출력하기
 */
public class UpperLowerCases {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i); // 인덱스에 해당하는 문자 추출
            if(Character.isUpperCase(c)){ // c 가 대문자인지 체크
                answer += Character.toLowerCase(c); // c가 대문자인 경우 소문자로 변경
            }else{
                answer += Character.toUpperCase(c);
            }
        }
        System.out.print(answer);
    }
}
