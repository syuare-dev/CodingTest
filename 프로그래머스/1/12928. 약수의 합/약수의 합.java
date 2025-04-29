class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            if(n%i == 0){ // 약수: 나머지 0
                answer += i; // 약수일 경우 더하기
            }
        }
        
        System.out.println("answer = " + answer);
        return answer;
    }
}