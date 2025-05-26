class Solution {
    public long solution(int price, int money, int count) {
        // 원래 이용료 price
        // N번째 이용 시 -> N*price (1,100 / 2,200 / 3,300)
        // count 만큼 탈 경우 나의 money에서 얼마의 금액이 모자란가
        
        long sum = 0;
        
        for(int i = 0; i<=count; i++){
            sum += i*price;
        }
        
        if (money-sum >=0) return 0;
        
        return sum - money;
        
    }
}