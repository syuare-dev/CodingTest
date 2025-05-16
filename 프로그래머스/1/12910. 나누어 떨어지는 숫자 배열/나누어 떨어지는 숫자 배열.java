import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> listInt = new ArrayList<>();

        for (int i : arr) {
            int x = 0;
            if ((double) i % divisor == 0 && divisor >0) {
                listInt.add(i);
            }
        }
        if (listInt.isEmpty()) listInt.add(-1);

        return listInt.stream()
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}