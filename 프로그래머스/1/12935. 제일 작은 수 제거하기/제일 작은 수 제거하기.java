import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] intArr = IntStream
                .range(0, arr.length)
                .filter(idx -> arr[idx] != Arrays.stream(arr).min().orElseThrow())
                .map(idx -> arr[idx])
                .toArray();
        
        if(intArr.length == 0) {
            return new int[] {-1};
        }

        return intArr;
        
        
    }
}