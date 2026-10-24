/**
 * Best Time to Buy and Sell Stock
 *
 * 1. We are given an array `prices[]`, where prices[i] represents
 *    the stock price on the ith day.
 *
 * 2. Our goal is to maximize profit by buying the stock on one day
 *    and selling it on a different day in the future.
 *
 * 3. Profit = Selling Price - Buying Price
 *
 * 4. The selling price must be greater than the buying price
 *    to make a profit.
 *
 * 5. We track the minimum stock price seen so far to find the
 *    best buying price.
 *
 * 6. For each day, we calculate the possible profit by selling
 *    at the current day's price:
 *    profit = currentPrice - minPrice
 *
 * 7. We update maxProfit whenever we find a higher profit.
 *
 * 8. The first day is considered as a possible buying day.
 *    We cannot buy and sell on the same day, so selling must
 *    happen on a later day.
 *
 * 9. If the stock price keeps decreasing and no profit is possible,
 *    we return 0.
 *
 * 10. We only need one loop, so the time complexity is O(n),
 *     and the auxiliary space complexity is O(1).
 */

//time complexity - O(N)
public class BuySellStock {

    public  static int buyandSellStock(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length;i++){
            //buy price is less then selling price
            if(buyPrice < price[i]){
                int profit = price[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        return  maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println("maxprofit is:"+buyandSellStock(price));
    }
}
