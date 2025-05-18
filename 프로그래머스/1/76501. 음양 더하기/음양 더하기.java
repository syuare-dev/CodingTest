class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        
        for (int i=0; i<signs.length; i++) {
            if (!signs[i]) absolutes[i] = -absolutes[i];
        }
        
        int answer = 0;
        for (int a : absolutes) {
            answer += a;
        }
        
        
        return answer;
    }
}