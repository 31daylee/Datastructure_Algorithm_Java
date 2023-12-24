package programmers.basic;
/**
 * 날짜: 2023/12/24
 * 내용: 코딩 기초 트레이닝_수 조작하기1
 *
 */
public class Control1 {
    public static void main(String[] args) {
        Test4 t = new Test4();
        int n = 0;
        String control = "wsdawsdassw";
        t.test4(n, control);
    }
}
class Test4{
    public int test4(int n, String control) {
        for (char cmd : control.toCharArray()) { // 문자열을 char 배열로 변환
            switch (cmd) {
                case 'w':
                    System.out.println("1"+cmd);
                    n += 1;
                    break;
                case 's':
                    System.out.println("2"+cmd);
                    n -= 1;
                    break;
                case 'd':
                    System.out.println("3"+cmd);
                    n += 10;
                    break;
                case 'a':
                    System.out.println("4"+cmd);
                    n -= 10;
                    break;
            }
        }
        System.out.println(n); // 입력에 대한 마지막 n 값
        return n;
    }

}
