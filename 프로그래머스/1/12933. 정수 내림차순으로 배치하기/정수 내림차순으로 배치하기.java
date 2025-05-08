import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // 1. 빈 배열을 생성
        // 1-1. 빈 배열 생성을 위해서는 배열의 길이를 구해야 함 > n의 자릿수를 먼저 구하기
        // 2. n의 자릿수 별 수를 배열에 반환
        // 3. 배열 요소 중 가장 큰 것을 내림차순으로 정렬
        // 4. 정렬된 배열 요소들을 자릿수(배열의 길이)에 맞게 더하기
        // 5. 더한 값을 return
        
        String strNum = String.valueOf(n);
        Long[] ArrLong = new Long[strNum.length()];
        
        for(int i=0; i<strNum.length(); i++){
            ArrLong[i] = (long)(n%10);
            n/=10;
        }
        
        Arrays.sort(ArrLong, Collections.reverseOrder());
          
        long answer = 0;
        
         for (int i=0; i<strNum.length(); i++){
            answer += (long) ArrLong[i] * (long) Math.pow(10,(strNum.length()-i)-1);
        }
        
        return answer;
    }
}