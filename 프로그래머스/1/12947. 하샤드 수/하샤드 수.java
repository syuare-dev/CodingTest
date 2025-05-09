class Solution {
    public boolean solution(int x) {
        
        String strNum = String.valueOf(x);
        int[] ArrInt = new int[strNum.length()];
        int sum = 0;
        int num = Integer.parseInt(strNum);
        
        for(int i=0; i<strNum.length(); i++){
            ArrInt[i] = num%10;
            num/=10;
            sum += ArrInt[i];
        }        
        
        boolean answer = false;
        if(x%sum == 0) {
            answer = true;
            System.out.println(x%sum);
        }   
        
        return answer;
    }
}