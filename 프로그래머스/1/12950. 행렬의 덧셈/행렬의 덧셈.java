class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 1. arr1[0][0] + arr2[0][0] = answer[0][0]
        // 2. arr1[0][0] + arr2[1][1] = answer[0][1]
        // 3. arr2[0][1] + arr2[1][1] = answer[1][1]
        
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for (int i=0; i<arr1.length; i++) {
            for (int j = 0; j<arr1[0].length; j++) {
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        
        
        
        return answer;
    }
}