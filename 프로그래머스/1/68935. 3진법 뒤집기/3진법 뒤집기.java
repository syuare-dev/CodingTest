class Solution {
    public int solution(int n) {
        
        StringBuilder base3 = new StringBuilder(Integer.toString(n,3));
        System.out.println("base3 = " + base3);
        String reverse = base3.reverse().toString();
        System.out.println("reverse = " + reverse);
        int decimal = Integer.parseInt(reverse,3);

        return decimal;
        
    }
}