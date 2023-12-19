package programmers.basic;
/**
 * 날짜: 2023/12/19
 * 내용: 코딩 기초 트레이닝_조건 문자열
 *
 */
class ConditionString {
    public int solution(String ineq, String eq, int n, int m) {

        if(ineq.equals("<")){
            if(eq.equals("=")){
                return n<=m ? 1 : 0;
            }else if(eq.equals("!")){
                return n < m ? 1 : 0;
            }

        }else if(ineq.equals(">")){
            if(eq.equals("=")){
                return n >= m ? 1 : 0 ;
            }else if(eq.equals("!")){
                return n > m ? 1 : 0;
            }
        }
        return 0;
    }
}
