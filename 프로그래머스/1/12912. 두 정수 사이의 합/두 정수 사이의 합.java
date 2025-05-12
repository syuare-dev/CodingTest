class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int minNum = Math.min(a,b);
        int maxNum = Math.max(a,b);            
        
        return (long) (minNum+maxNum)*(maxNum-minNum+1)/2;
    }
}