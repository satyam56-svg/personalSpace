class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int first=prices[0];
        int second=prices[1];

        int moneyLeft=money-first-second;
        if(moneyLeft<0) {
            return money;
        } else {
            return moneyLeft;
        }
    }
}