package programmers.basic;
/**
 * 날짜: 2023/12/23
 * 내용: 코딩 기초 트레이닝_주사위 게임2
 *
 */
class Dice {
    public int dice(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        } else if (a == b && b == c) {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {

            return (a + b + c) * (a * a + b * b + c * c);
        }
    }
}
