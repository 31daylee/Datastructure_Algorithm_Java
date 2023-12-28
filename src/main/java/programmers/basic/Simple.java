package programmers.basic;
/**
 * 날짜: 2023/12/27
 * 내용: 코딩 기초 트레이닝_간단한 논리 연산
 */
public class Simple {
    public boolean simple(boolean x1, boolean x2, boolean x3, boolean x4) {
        if((x1==true || x2==true)&&(x3==true || x4==true)){ // 각 그룹에서 둘 중 하나가 true 이면 return true
            return true;
        }else{
            return false;
        }


    }
}
