class Solution {
    public double solution(int[] numbers) {
        int sumBox = 0;
        
        for(int i=0; i<numbers.length; i++){
            sumBox += numbers[i];
        }
        
        return (double) sumBox / numbers.length;
    }
}