class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length];
        
        
        for (int i=answer.length-1, j=0; j<answer.length; i--,j++) {
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}