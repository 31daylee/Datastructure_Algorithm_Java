package book.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 날짜: 2023/12/25
 * 내용: 92p~ 95p 큰 수의 법칙
 */
public class _92BigNum {

    static Integer n;
    static Integer m;
    static Integer k;
    static Integer first, second;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] number = new int[n];

        for(int i =0; i < n; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(number);

        first = number[n-1]; // 가장 큰 수
        second = number[n-2]; // 두 번째로 큰 수
        simpleSolution();
        advancedSolution();

    }

    static void simpleSolution(){
        System.out.println("[93p 단순하게 푸는 솔루션]");

        int localM = m.intValue();
        int result = 0;

        while (true){
            for(int i = 0; i <k; i++){
                if(localM == 0) break;
                result += first;
                localM -= 1;
            }
            if(localM == 0) break;
            result +=second;
            localM -= 1;
        }
        System.out.println("result : "+ result);
    }

    static void advancedSolution(){
        System.out.println("[95p 최적화 솔루션]");

        int count = (m / (k+1)) * k;
        int remain = m -count;

        int result = count * first + remain * second;
        System.out.println("result : "+ result);
    }

}
