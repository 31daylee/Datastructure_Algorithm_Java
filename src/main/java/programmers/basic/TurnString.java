package programmers.basic;

import java.util.Scanner;
/**
 * 날짜: 2023/12/17
 * 내용: 코딩 기초 트레이닝_문자열 돌리기
 * 출력할 내용 : a
 *             b
 *             c
 *
 */
public class TurnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i = 0; i<a.length(); i++){
            System.out.println(a.substring(i, i+1));
        }
    }
}
