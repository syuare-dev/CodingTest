class Solution {
    public long solution(long n) {
        long answer =0;
        for(long x=0; x*x<=n; x++) {            
            answer = ((x*x == n)? (x+1)*(x+1) : -1);            
        }
        
        return answer;
    }
}