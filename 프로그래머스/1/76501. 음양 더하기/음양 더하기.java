import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        
//         for (int i=0; i<signs.length; i++) {
//             if (!signs[i]) absolutes[i] = -absolutes[i];
//         }
        
//         int answer = 0;
//         for (int a : absolutes) {
//             answer += a;
//         }
        
//         return answer;
        
        return IntStream.range(0, absolutes.length)
            .map(i-> signs[i] ? absolutes[i] : -absolutes[i])
            .sum();
    }
}