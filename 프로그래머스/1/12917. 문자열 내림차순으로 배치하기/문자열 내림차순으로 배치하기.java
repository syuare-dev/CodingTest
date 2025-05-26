import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        String[] arrStr = new String[s.length()];

        for (int i=0; i<s.length(); i++) {
            arrStr[i] = s.substring(i,i+1);
        }

        Arrays.sort(arrStr, Comparator.reverseOrder());

        return String.join("", arrStr);
    }
}