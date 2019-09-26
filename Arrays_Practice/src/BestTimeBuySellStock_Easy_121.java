public class BestTimeBuySellStock_Easy_121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new BestTimeBuySellStock_Easy_121().maxProfit(prices));
    }

    public int maxProfit(int[] prices){
        int maxCurr = 0, maxSoFar = 0;

        for (int i = 1; i < prices.length; i++) {
    /**     Here maxCurr value is reset to 0 again if the difference comes out to be negative,
     *      else, the maxCurr values is added up or subtracted until the difference doesn't go out to be negative.
     * */
            maxCurr = Math.max(0, maxCurr += prices[i] - prices[i -1]);
            maxSoFar = Math.max(maxCurr, maxSoFar);
        }
        return maxSoFar;
    }

    /**
     *   Leetcode provided o(1) solution.
     */
    /*
    public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
*/

    /**
     * Solution accepted but can be better which is mentioned above.
     * */
    /*public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit)
                    profit = prices[j] - prices[i];
            }
        }
        return profit;
    }*/
}
