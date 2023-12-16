package programmers.basic;

import java.util.Scanner;

/**
 * 날짜: 2023/12/17
 * 내용: 코딩 기초 트레이닝_홀짝 구분하기
 * 출력할 내용 : 1 is odd
 *
 */
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.print(n + " is even");
        }else{
            System.out.print(n + " is odd");
        }
    }

}
