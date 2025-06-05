class Solution {
    public int solution(int n) {
        
        StringBuilder base3 = new StringBuilder(Integer.toString(n,3));
        String reverse = base3.reverse().toString();
        int decimal = Integer.parseInt(reverse,3);

        return decimal;
        
    }
}