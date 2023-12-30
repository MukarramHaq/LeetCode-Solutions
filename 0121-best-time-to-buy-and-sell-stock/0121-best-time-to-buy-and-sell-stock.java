class Solution {
    public int maxProfit(int[] prices) {
        
        //Keep track of the minimum and maximum profit
        //Fixed size of variable size sliding window?
        // if(prices.length == 1){
        //     return 0;
        // }
        // int left = 0;
        // int right = 1;
        // int maxProfit = 0;
        // if(prices[right] == prices[left]){
        //         right++;
        //     }
        // while(right < prices.length){
        //     if(prices[right] < prices[left]){
        //         right++;
        //         left++;
        //         continue;
        //     }
        //     if(prices[right] > prices[left]){
        //         if(prices[right] > maxProfit){
        //             maxProfit = prices[right] - prices[left];
        //             right++;
        //         }else{
        //             right++;
        //         }
        //     }
        // }

        // return maxProfit;

        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            }else{
                left = right;
            }
            right++;
        }

        return maxProfit;

    }
}