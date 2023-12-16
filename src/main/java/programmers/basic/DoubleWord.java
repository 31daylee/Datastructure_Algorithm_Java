package programmers.basic;

import java.util.Scanner;

/**
 * 날짜: 2023/12/17
 * 내용: 코딩 기초 트레이닝_문자열 붙여서 출력하기
 * 출력할 내용 : HelloWorld!
 *
 */
public class DoubleWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.print(a+b);
    }
}
