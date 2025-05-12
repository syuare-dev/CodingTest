class Solution {
    public int solution(int num) {
        int answer = 0;
        long result = num;
        
        for(int i=1; i<=500; i++){
            if(result != 1) {
                if(result%2==0) {
                    result = result/2;
                    answer++;
                } else {
                    result = result*3+1;        
                    answer++;
                }    
            }
        }
        
        if (answer == 1) return 0;
        else if (answer == 500) return -1;
        else return answer;
    }
}