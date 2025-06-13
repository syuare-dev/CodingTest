class Solution {
    public int solution(int[] number) {
        // 1. 1번 배열 요소와
        // 2. 2번 배열 요소와
        // 3. 3번 배열 요소의
        // 4. 합이 0인 조합이
        // 5. 몇 개인지 계산하시오
        // 6. 단, 동일한 조합은 중복 제거 필요
        
        int answer = 0;
        
        for (int i=0; i<number.length; i++) {
            for(int j=i+1; j<number.length; j++) {
                for (int k=j+1; k<number.length; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if(sum == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}