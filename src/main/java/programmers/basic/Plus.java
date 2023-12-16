package programmers.basic;

import java.util.Scanner;
/**
 * 날짜: 2023/12/17
 * 내용: 코딩 기초 트레이닝_덧셈식 출력하기
 * 출력할 내용 : 4 + 5 = 9
 *
 */
public class Plus {
    public static void main(DoubleWord[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;
        System.out.println(a +" + "+ b +" = "+ c);
    }
}
