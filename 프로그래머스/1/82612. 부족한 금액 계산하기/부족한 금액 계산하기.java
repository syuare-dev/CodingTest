class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;

        for(int i = 0; i<=count; i++){
            sum += i*price;
        }

        return (money-sum)>=0 ? 0 : sum-money;
        
    }
}