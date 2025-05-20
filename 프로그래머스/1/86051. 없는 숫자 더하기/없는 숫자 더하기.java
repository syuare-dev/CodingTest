import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
                
        return IntStream.range(0,10).sum() - Arrays.stream(numbers).sum();
    }
}