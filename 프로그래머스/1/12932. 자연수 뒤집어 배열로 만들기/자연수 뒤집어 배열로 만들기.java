class Solution {
    public int[] solution(long n) {
        long a = n;
        int num = 0;
        while(a>0) {
            a/=10;
            num++;
        }

        int[] answer = new int[num];

        for(int i=0; i<answer.length; i++){
            answer[i] = (int)(n%10);
            n/=10;
        }


        return answer;
    }
}